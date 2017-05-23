package org.xyy.b2c.root.product.mapper;

import org.xyy.b2c.leaf.product.model.ProductCollection;

public interface ProductCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCollection record);

    int insertSelective(ProductCollection record);

    ProductCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCollection record);

    int updateByPrimaryKey(ProductCollection record);
}