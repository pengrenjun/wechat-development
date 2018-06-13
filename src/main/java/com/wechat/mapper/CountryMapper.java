package com.wechat.mapper;

import com.wechat.model.wechatPo.Country;

import java.util.List;

public interface CountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    int insertSelective(Country record);

    Country selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Country record);

    int updateByPrimaryKey(Country record);

    List<Country> getCountyList();
}