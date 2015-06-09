package com.teamapp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest {
	
	private ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
	
	@Test
	public void testTransaction() throws Exception {
		TestService testService = (TestService) ac.getBean("testService"); 
		testService.saveTwoUsers();
	}
}
