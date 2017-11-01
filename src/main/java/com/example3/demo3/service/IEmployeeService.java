package com.example3.demo3.service;

import com.example3.demo3.query.QueryObject;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    Map<Object,Object> query(QueryObject qo);

    void delete(Long id);
}
