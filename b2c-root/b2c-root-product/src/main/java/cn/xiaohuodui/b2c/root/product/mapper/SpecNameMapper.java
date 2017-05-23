package cn.xiaohuodui.b2c.root.product.mapper;

import cn.xiaohuodui.b2c.leaf.product.model.SpecName;

public interface SpecNameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpecName record);

    int insertSelective(SpecName record);

    SpecName selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpecName record);

    int updateByPrimaryKey(SpecName record);
}