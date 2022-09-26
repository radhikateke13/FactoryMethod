package com.spring.FactoryMethodType2and3;

public class PrintableFactory {

	
	public Printable getPrintable(){ 

	//	public static Printable getPrintable(){ 
		 //return new B(); 
		 return new SimpleA();//return any one instance, either A or B 
		} 
		}

