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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A a1 = (A) ctx.getBean("obja");
		System.out.println("value of a1 is "+a1);
		
		A a2 = (A) ctx.getBean("obja");
		System.out.println("value of a2 is "+a2);
	}
}
