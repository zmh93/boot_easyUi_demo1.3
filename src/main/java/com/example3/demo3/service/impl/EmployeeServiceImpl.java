package com.example3.demo3.service.impl;

import com.example3.demo3.dao.EmployeeMapper;
import com.example3.demo3.query.QueryObject;
import com.example3.demo3.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Map<Object, Object> query(QueryObject qo) {
        List<Map<Object, Object>> maps = employeeMapper.queryForList(qo);
        int                       i    = employeeMapper.queryForCount(qo);
        Map<Object, Object> map = new LinkedHashMap<>();
        map.put("total",i);
        map.put("rows",maps);
        return map;
    }

    @Override
    public void delete(Long id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save(String name, String age, String email, Long did) {
        employeeMapper.insert(name, age, email, did);
    }

    @Override
    public void update(Long id, String name, String age, String email, Long did) {
        employeeMapper.update(id, name, age, email, did);
    }
}
