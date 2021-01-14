package com.cluster;

import javax.inject.Inject;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class A {

	@Inject // applying annotation to field
	private B b;

	public A() {
		System.out.println("Inside default constructor of A");
	}

	// @Inject  // applying annotation to constructor
	public A(B b) {
		System.out.println("Inside parameterized constructor of A");
		this.b = b;
	}

	public B getB() {
		return b;
	}

	//@Inject // applying annotation to setter
	public void setB(B b) {
		System.out.println("Inside setB() method of A");
		this.b = b;
	}

	//@Inject // applying annotation to arbitrary method
	public void fun(B b) {
		System.out.println("Inside arbitrary fun() method of A");
		this.b = b;
	}
}
