package com.cluster;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Customer implements InitializingBean, DisposableBean {

	private int cid;
	private String cname;

	public Customer() {
		System.out.println("Inside constructor of Customer");
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		System.out.println("Inside setCid() method of Customer");
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		System.out.println("Inside setCname() method of Customer");
		this.cname = cname;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// write initialization logic
		System.out.println("Inside afterPropertiesSet() method of Customer");
	}

	@Override
	public void destroy() throws Exception {
		// write cleanup logic
		System.out.println("Inside destroy() method of Customer");
	}
}
