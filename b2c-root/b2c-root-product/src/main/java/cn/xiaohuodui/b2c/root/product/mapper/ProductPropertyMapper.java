package cn.xiaohuodui.b2c.root.product.mapper;

import cn.xiaohuodui.b2c.leaf.product.model.ProductProperty;

public interface ProductPropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductProperty record);

    int insertSelective(ProductProperty record);

    ProductProperty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductProperty record);

    int updateByPrimaryKey(ProductProperty record);
}