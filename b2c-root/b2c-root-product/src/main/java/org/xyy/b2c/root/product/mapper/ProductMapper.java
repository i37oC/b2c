package org.xyy.b2c.root.product.mapper;

import org.xyy.b2c.leaf.product.model.Product;
import org.xyy.b2c.leaf.product.model.ProductWithBLOBs;

public interface ProductMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProductWithBLOBs record);

    int insertSelective(ProductWithBLOBs record);

    ProductWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductWithBLOBs record);

    int updateByPrimaryKey(Product record);
}