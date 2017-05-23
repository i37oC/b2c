package cn.xiaohuodui.b2c.root.product.mapper;

import cn.xiaohuodui.b2c.leaf.product.model.ProductCollectionRelation;

public interface ProductCollectionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCollectionRelation record);

    int insertSelective(ProductCollectionRelation record);

    ProductCollectionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCollectionRelation record);

    int updateByPrimaryKey(ProductCollectionRelation record);
}