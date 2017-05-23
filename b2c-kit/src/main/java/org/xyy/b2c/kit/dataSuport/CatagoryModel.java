package org.xyy.b2c.kit.dataSuport;

import java.util.List;

/**
 * @author xyy
 * @version 1.0 2017/5/22.
 * @since 1.0
 */
public class CatagoryModel {
    private int id;
    private String name;
    private List<CatagoryModel> subCatas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CatagoryModel> getSubCatas() {
        return subCatas;
    }

    public void setSubCatas(List<CatagoryModel> subCatas) {
        this.subCatas = subCatas;
    }
}
