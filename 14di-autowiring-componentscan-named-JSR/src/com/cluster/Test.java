package com.cluster;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Named
public class Test {

	@Inject
	@Named("hello")
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

}
