package com.wechat.controller;

import com.wechat.model.wechatPo.Country;
import com.wechat.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/country")
public class countryController {
    @Autowired
    private CountryService countryService;


    @RequestMapping(value = "countryList")
    public ModelAndView countryList() {
        ModelAndView mv = new ModelAndView("showCountryInfo");
        List<Country> countryList = countryService.getCountyList();
        mv.addObject("countryList", countryList);
        return mv;
    }


}
