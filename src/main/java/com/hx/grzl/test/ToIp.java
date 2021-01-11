package com.hx.grzl.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: hx-demo
 * @description: ${description}
 * @author: huaxiao
 * @create: 2021-01-06 17:21
 **/
public class ToIp {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机IP地址
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        //获取www.baidu.com的地址
        System.out.println(InetAddress.getByName("HT-HBASE-MASERATI-11-7-98-34.hadoop.jd.local"));
        //获取www.baidu.com的真实IP地址
        System.out.println(InetAddress.getByName("HT-HBASE-MASERATI-11-7-98-34.hadoop.jd.local").getHostAddress());
        //获取配置在HOST中的域名IP地址
//        System.out.println(InetAddress.getByName("TEST").getHostAddress());
    }
}
