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
		System.out.println("Begin main()");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A) ctx.getBean("obja");
		
		System.out.println("Successfully Done!!");
	}
}
