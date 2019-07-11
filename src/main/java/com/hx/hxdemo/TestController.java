package com.hx.hxdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huaxiao on 2019/6/1.
 */
@RestController
@RequestMapping("order")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("create")
    @ResponseBody
    public String create(String name){
        return String.format("order create successful, name:{}, port{}",name,port);
    }
}
