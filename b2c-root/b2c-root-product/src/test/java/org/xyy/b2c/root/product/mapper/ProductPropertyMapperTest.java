package org.xyy.b2c.root.product.mapper;


import org.xyy.b2c.leaf.product.model.ProductProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xyy
 * @version 1.0 2017/5/22.
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductPropertyMapperTest {
    @Autowired
    private ProductPropertyMapper productPropertyMapper;

    @Test
    public void deleteByPrimaryKey() throws Exception {

    }

    @Test
    public void insert() throws Exception {
        ProductProperty productProperty = new ProductProperty();
        productProperty.setpKey("xx");
        productProperty.setProductId(12424);
        productProperty.setpValue("xxx");
        productProperty.setSort(1);
        productPropertyMapper.insert(productProperty);
    }

    @Test
    public void insertSelective() throws Exception {

    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        System.out.println(productPropertyMapper.selectByPrimaryKey(4));
    }

    @org.junit.Test
    public void updateByPrimaryKeySelective() throws Exception {

    }

    @org.junit.Test
    public void updateByPrimaryKey() throws Exception {

    }

}