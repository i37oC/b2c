package cn.xiaohuodui.b2c.root.product.mapper;

import cn.xiaohuodui.b2c.leaf.product.model.ProductSpec;

public interface ProductSpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);

    ProductSpec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKeyWithBLOBs(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
}