package com.cluster;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Demo {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee) ac.getBean("emp");
		System.out.println("Employee id is "+emp.getEmpid());
		System.out.println("Employee name is  "+emp.getName());
		System.out.println("Employee salary is  "+emp.getSalary());
	}
}
