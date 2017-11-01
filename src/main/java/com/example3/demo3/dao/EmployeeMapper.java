package com.example3.demo3.dao;

import com.example3.demo3.query.QueryObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface EmployeeMapper {

    List<Map<Object,Object>> queryForList(QueryObject qo);

    int queryForCount(QueryObject qo);

    int deleteByPrimaryKey(Long id);

}
