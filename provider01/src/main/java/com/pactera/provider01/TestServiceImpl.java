package com.pactera.provider01;

import com.pactera.service.TestService;

public class TestServiceImpl implements TestService {  
	  
    public String test() {  
        System.out.println("test success");  
        return "provider01";  
    }  
  
} 