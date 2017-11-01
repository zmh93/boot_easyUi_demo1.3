package com.example3.demo3;

import com.example3.demo3.dao.EmployeeMapper;
import com.example3.demo3.query.QueryObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo3ApplicationTests {
    @Autowired
    private EmployeeMapper empoyeeMapper;

	@Test
	public void contextLoads() {
        System.out.println(empoyeeMapper.queryForCount(new QueryObject()));
    }

}
