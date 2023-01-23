package com.shopMaster.clientService.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class companyControler {

     @Value("${xParam}")
     private int xParam;
    @Value("${yParam}")

    private int yParam;
    @Value("${server.port}")

    private int port;
    @Value("${me}")

    private String me;
    @GetMapping("/myCompany")

    public Map<String,Object> getCompany(){
         Map<String,Object> myMap = new HashMap<>();
         myMap.put("xParam",xParam);
         myMap.put("yParam",yParam);
         myMap.put("me",me);
         myMap.put("threadName",Thread.currentThread().getName());
         myMap.put("porte",port);
         return myMap;
    }
}
