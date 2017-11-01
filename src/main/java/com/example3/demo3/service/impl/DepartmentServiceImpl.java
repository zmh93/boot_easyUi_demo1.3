package com.example3.demo3.service.impl;

import com.example3.demo3.dao.DepartmentMapper;
import com.example3.demo3.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@Service
public class DepartmentServiceImpl implements IDepartmentService{

    @Autowired
    private DepartmentMapper departmentMapper;

    @Transactional(readOnly = true)
    @Override
    public List<Map<Object, Object>> listAll() {
        return departmentMapper.selectAllForEmployee();
    }
}
