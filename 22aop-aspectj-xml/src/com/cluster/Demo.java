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
		Juggler j = (Juggler) ctx.getBean("jug");
		
		try {
			j.perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
