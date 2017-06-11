package com.itheima.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1_1 {
	
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void run1(){
		jdbcTemplate.update("insert into t_account values (null,?,?)", "小天",10000);
	}
}
