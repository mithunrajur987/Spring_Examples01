package com.cluster;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Employee implements InitializingBean, DisposableBean,
		BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	private int empid;
	private String name;
	private String beanname;
	private BeanFactory fct;
	private ApplicationContext ac;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside setName() method of Employee");
		this.name = name;
	}

	@Override
	public void setBeanName(String beanname) {
		this.beanname = beanname;
		System.out.println("Inside setBeanName() method of Employee  " + beanname);
	}

	@Override
	public void setBeanFactory(BeanFactory fct) throws BeansException {
		this.fct = fct;
		System.out.println("Inside setBeanFactory() method of Employee");
	}

	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		this.ac= ac;
		System.out.println("Inside setApplicationContext() method of Employee");
	}
	
	@PostConstruct
	public void myinit() throws Exception {
		// write initialization logic
		System.out.println("Inside custom life cycle method myinit() of Employee");
	}

	@PreDestroy
	public void mycleanup() throws Exception {
		// write cleanup logic
		System.out.println("Inside custom life cycle method mycleanup() of Employee");
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
