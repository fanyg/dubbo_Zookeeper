package com.pactera.controller;

import java.util.Map;  


import javax.annotation.Resource;  
  
  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;  
  
  
import com.pactera.service.TestService;  
  
  
  
  
/**  
 * @author xianghui1  
 *  
 *         测试controller  
 */  
@Controller  
public class TestController {  
  
  
    @Resource(name = "testService")  
    TestService testInterface;  
  
  
    @RequestMapping(value = { "/consumer/testMain" })  
    @ResponseBody  
    public String testDubbo() {  
        return "consuemr02" + testInterface.test();  
    }  
  
  
}
