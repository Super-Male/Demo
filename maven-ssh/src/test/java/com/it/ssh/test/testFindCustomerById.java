package com.it.ssh.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.it.shh.dao.CustomerDao;
import com.it.shh.entity.Customer;

public class testFindCustomerById {
	@Test
	public void testFindCustomerById() {
	//获取spring容器
	ApplicationContext applicationContext = new
	ClassPathXmlApplicationContext("applicationContext.xml");
	//获取dao
	CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
	//调用dao方法
	Customer customer = customerDao.findCustomerById(1);
	System.out.println(customer);
	}
}
