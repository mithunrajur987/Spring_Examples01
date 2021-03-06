package com.cluster;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Employee implements InitializingBean, DisposableBean {

	private int empid;
	private String ename;

	public Employee() {
		System.out.println("Inside constructor of Employee");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		System.out.println("Inside setEmpid() method of Employee");
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("Inside setEname() method of Employee");
		this.ename = ename;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// write initialization logic
		System.out.println("Inside afterPropertiesSet() method of Employee");
	}

	@Override
	public void destroy() throws Exception {
		// write cleanup logic
		System.out.println("Inside destroy() method of Employee");
	}
}
