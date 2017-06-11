package com.itheima.demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Jdbc模板类
 * @author dell
 *
 */
public class Demo1 {

	@Test
	public void run1(){
		//spring提供了内置的连接池
		DriverManagerDataSource  dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day03");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		//创建模板类
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		//完成操作
		template.update("insert into t_account values (null,?,?)", "美美",10000);
		
	}
}
