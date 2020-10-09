
package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/demo/spring-config.xml");
		Employee employee = (Employee) context.getBean("demo"); 
		employee.setEmpNo(51886678);
		employee.setEmpName("Vishnu");
		employee.setAddress("Banglore");
		System.out.println("Employee Number is : " + employee.getEmpNo());
		System.out.println("Employee Name is : " + employee.getEmpName());
		System.out.println("Employee Address is : " + employee.getAddress());
		
		
		

	}

}
