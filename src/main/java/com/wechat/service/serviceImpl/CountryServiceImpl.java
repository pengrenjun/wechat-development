package com.wechat.service.serviceImpl;


import com.wechat.mapper.CountryMapper;
import com.wechat.model.wechatPo.Country;
import com.wechat.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

   @Autowired
   private CountryMapper countryMapper;


    @Override
    public Country getCouuntyInfoById(Integer id) {
        return countryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Country> getCountyList() {

        return countryMapper.getCountyList();
    }
}
