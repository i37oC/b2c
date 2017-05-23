package cn.xiaohuodui.b2c.root.product.mapper;

import cn.xiaohuodui.b2c.leaf.product.model.SpecValue;

public interface SpecValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecValue record);

    int insertSelective(SpecValue record);

    SpecValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecValue record);

    int updateByPrimaryKey(SpecValue record);
}