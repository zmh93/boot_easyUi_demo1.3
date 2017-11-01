package com.example3.demo3.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface DepartmentMapper {
    List<Map<Object, Object>> selectAllForEmployee();
}
