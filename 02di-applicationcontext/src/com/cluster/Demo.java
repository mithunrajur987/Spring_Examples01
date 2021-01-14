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
		Employee e = (Employee) ac.getBean("emp");
		
		System.out.println("Employee id is " + e.getEmpid());
		System.out.println("Employee name is " + e.getName());
		System.out.println("Employee salary is " + e.getSalary());
	}
}
