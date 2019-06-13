package com.hx.hxdemo.practice.list;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) throws JsonProcessingException {
        List<Object> list = new ArrayList<>();
        list.add("aaa");
        list.add(123);
        System.out.println(new ObjectMapper().writeValueAsString(list));

        int[] arr = {1,2,3};
        System.out.println(new ObjectMapper().writeValueAsString(arr));

        Object[] arr1 = {"aaa",'b',3};
        System.out.println(new ObjectMapper().writeValueAsString(arr1));
    }
}
