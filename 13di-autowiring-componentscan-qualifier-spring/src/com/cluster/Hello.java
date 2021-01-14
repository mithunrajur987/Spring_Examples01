package com.cluster;

import org.springframework.stereotype.Component;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Component
public class Hello implements A {

	@Override
	public void msg() {
		System.out.println("Saying Hello Hello");
	}
}
