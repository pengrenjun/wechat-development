package com.wechat.service;


import com.wechat.model.wechatPo.Country;

import java.util.List;

public interface CountryService {

    Country getCouuntyInfoById(Integer id);

    List<Country> getCountyList();
}
