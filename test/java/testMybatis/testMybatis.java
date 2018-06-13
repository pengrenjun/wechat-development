package testMybatis;

import com.alibaba.fastjson.JSONObject;
import com.wechat.model.wechatPo.Country;
import com.wechat.service.CountryService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class testMybatis {

    private static Logger logger = Logger.getLogger(testMybatis.class);

    @Resource
    private CountryService countryService;

    @Test
    public void testA (){
        Country country=countryService.getCouuntyInfoById(1);
        logger.info(JSONObject.toJSON(country));
    }

}
