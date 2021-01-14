package com.cluster;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;

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
		Person p = (Person) ac.getBean("per");
		
		String[] hb = p.getHobbies();
		ArrayList<String> em = p.getEmails();
		HashSet<String> ph = p.getPhones();
		HashMap<String, String> ed = p.getEducation();
		Properties ptg = p.getPercentage();
		
		System.out.println("Person's id - " + p.getPid());
		System.out.println("Person's name - " + p.getName());

		System.out.println("Hobbies are ");
		for (String s : hb) {
			System.out.println("   "+s);
		}
		
		System.out.println("Emails are ");
		for (String s : em) {
			System.out.println("   "+s);
		}

		System.out.println("Phones are - ");
		for (String s : ph) {
			System.out.println("   "+s);
		}
		
		
		System.out.println("Education Details are- ");
		Iterator it = ed.entrySet().iterator();
		while(it.hasNext()){
			System.out.println("   " +it.next());
		}
		
		System.out.println("Percentage Details are- ");
		Enumeration e = ptg.propertyNames();
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
			System.out.println(key + "   " +ptg.getProperty(key));
		}
	}
}
