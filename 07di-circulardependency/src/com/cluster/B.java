package com.cluster;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class B {
	
	private A a;

	public B() {
		System.out.println("Inside default constructor of B");
	}

	public B(A a) {
		System.out.println("Inside parameterized constructor of B");
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		System.out.println("Inside setA() method of B");
		this.a = a;
	}

}
