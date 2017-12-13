package com.pactera.provider02;

import org.springframework.stereotype.Service;

import com.pactera.service.TestService;
@Service
public class TestServiceImpl implements TestService {  
	  
    public String test() {  
        System.out.println("test success");  
        return "provider02";  
    }  
  
} 
