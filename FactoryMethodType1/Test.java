package com.spring.FactoryMethodType1;


import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/FactoryMethodType2/applicationcontext.xml");
		// ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); 

		 SimpleA a=(SimpleA)context.getBean("a"); 
		 a.msg(); 
		} 
		}
	


