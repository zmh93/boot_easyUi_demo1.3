package com.example3.demo3.web;

import com.alibaba.fastjson.JSON;
import com.example3.demo3.query.QueryObject;
import com.example3.demo3.service.IDepartmentService;
import com.example3.demo3.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping(value="/list")
    public Object list(QueryObject qo) {
        return JSON.toJSON(employeeService.query(qo));
    }

    @RequestMapping(value = "/delete")
    public Object delete(Long id) {
        HashMap<Object, Object> map = new HashMap<>();
        employeeService.delete(id);
        map.put("msg", "删除成功");
        map.put("success", true);
        return JSON.toJSON(map);
    }

    @RequestMapping(value = "/departments")
    public Object departments() {
        return JSON.toJSON(departmentService.listAll());
    }

    @RequestMapping(value="/save")
    public Object save(Long id, String name, String age, String email, Long did) {
        HashMap<Object, Object> map = new HashMap<>();
        if (id==null) {
            employeeService.save(name,age,email,did);
            map.put("msg", "添加成功");
        }else{
            employeeService.update(id, name, age, email, did);
            map.put("msg", "编辑成功");
        }
        map.put("success", true);
        return JSON.toJSON(map);
    }
}

