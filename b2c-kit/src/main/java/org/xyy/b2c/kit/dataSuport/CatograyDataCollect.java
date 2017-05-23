package org.xyy.b2c.kit.dataSuport;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * 收集 淘宝 主页的三级分类
 * 存到数据库中。
 *
 * @author xyy
 * @version 1.0 2017/5/22.
 * @since 1.0
 */
public class CatograyDataCollect {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("catagory/taobao.html");
        String htmlString = StreamUtils.copyToString(resource.getInputStream(), Charset.forName("utf-8"));

        Resource resource2= new ClassPathResource("catagory/3class-data.json");
        String data = StreamUtils.copyToString(resource2.getInputStream(), Charset.forName("utf-8"));
        JSONObject all3data =  JSON.parseObject(data);

        Document document = Jsoup.parse(htmlString);

        Elements elements = document.getElementsByTag("span");

        List<CatagoryModel> all = new ArrayList<>();
        for(Element e : elements){
            String firstClassName = e.text();
            CatagoryModel firstCata = new CatagoryModel();
            firstCata.setName(firstClassName);

            Elements twoElements = e.getElementsByTag("a");
            List<CatagoryModel> twoModels = new ArrayList<>();
            for(Element te : twoElements){
                String id = te.attr("data-dataid");
                String name = te.text();
                CatagoryModel tmodel = new CatagoryModel();
                tmodel.setId(Integer.valueOf(id));
                tmodel.setName(name);
                twoModels.add(tmodel);

                List<CatagoryModel> c3s = get3Models(all3data, Integer.valueOf(id));
                tmodel.setSubCatas(c3s);
            }
            firstCata.setSubCatas(twoModels);

            all.add(firstCata);
        }
        System.out.println(JSON.toJSON(all));

        //给 每个catoagry 设置一个主键
        int c1i = 100;
        int c2i = 1000;
        int c3i = 10000;
        for(CatagoryModel c1 : all){
            int c1id = c1i++;
            c1.setId(c1id);

            List<CatagoryModel> c2s = c1.getSubCatas();
            for(CatagoryModel c2 : c2s){
                c2.setId(c2i++);


                List<CatagoryModel> c3s = c2.getSubCatas();
                for(CatagoryModel c3 : c3s) {
                    c3.setId(c3i++);
                }
            }

        }

        System.out.println(JSON.toJSON(all));


    }

    private static void setSubcatagoryid(CatagoryModel catagoryModel , int id){

    }

    private static List<CatagoryModel> get3Models(JSONObject all, int id) throws IOException {

        JSONObject third =  (JSONObject) all.get(String.valueOf(id));

        JSONArray list = third.getJSONObject("value").getJSONArray("list");

        List<CatagoryModel> c3s = new ArrayList<>();

        for(Object o : list){
            JSONObject jsonObject = (JSONObject) o;
            String name = jsonObject.getString("name");
            CatagoryModel c3 = new CatagoryModel();
            c3.setName(name);
            c3s.add(c3);
        }

        return c3s;
    }

}
