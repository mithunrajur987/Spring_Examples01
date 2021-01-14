package com.cluster;

import javax.inject.Named;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Named
public class Hai implements A {

	@Override
	public void msg() {
		System.out.println("Saying Hai Hai");
	}
}
