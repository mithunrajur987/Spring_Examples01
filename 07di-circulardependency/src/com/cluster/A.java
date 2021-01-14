package com.cluster;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class A {

	private B b;

	public A() {
		System.out.println("Inside default constructor of A");
	}

	public A(B b) {
		System.out.println("Inside parameterized constructor of A");
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("Inside setB() method of A");
		this.b = b;
	}
}
