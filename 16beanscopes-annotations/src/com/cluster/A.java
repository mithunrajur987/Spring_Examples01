package com.cluster;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Component
//@Scope("singleton")
public class A {

	public A() {
		System.out.println("Inside constructor of A");
	}

}
