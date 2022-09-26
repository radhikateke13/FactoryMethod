package com.spring.FactoryMethodType1;

public class SimpleA {
	
		private static final SimpleA obj=new SimpleA(); 
		private SimpleA(){System.out.println("private constructor");} 
		public static SimpleA getA(){ 
		 System.out.println("factory method "); 
		 return obj; 
		} 
		public void msg(){ 
		 System.out.println("hello user"); 
		} 
		}

