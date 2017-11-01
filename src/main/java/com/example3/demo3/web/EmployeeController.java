package com.example3.demo3.web;

import com.alibaba.fastjson.JSON;
import com.example3.demo3.query.QueryObject;
import com.example3.demo3.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping(value="/list")
    public Object list(QueryObject qo) {
        System.out.println(qo);
        return JSON.toJSON(employeeService.query(qo));
    }

    @RequestMapping(value = "/delete")
    public Object delete(Long id) {
        HashMap<Object, Object> map = new HashMap<>();
        employeeService.delete(id);
        map.put("success", true);
        map.put("msg", "删除成功");
        return JSON.toJSON(map);
    }
}

