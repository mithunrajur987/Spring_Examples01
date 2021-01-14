package com.cluster;

import javax.inject.Named;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Named
public class B {
	
	public B() {
		System.out.println("Inside default constructor of B");
	}

	public void m1() {
		System.out.println("Inside m1() method of B");
	}
}
