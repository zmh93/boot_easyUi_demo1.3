package com.example3.demo3.web;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class GlueController {

    @RequestMapping(value="menu")
    public Object menu() {
        ArrayList<Object>       list = new ArrayList<>();
        HashMap<Object, Object> map1 = new LinkedHashMap<>();
        map1.put("id", 1);
        map1.put("text", "员工管理");
        map1.put("url", "/index.html");
        list.add(map1);
        map1 = new  LinkedHashMap<>();
        map1.put("id", 2);
        map1.put("text", "部门管理");
        list.add(map1);
        return JSON.toJSON(list);
    }
}
