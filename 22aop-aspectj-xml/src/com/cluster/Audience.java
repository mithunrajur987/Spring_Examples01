package com.cluster;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class Audience {

	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
	
	public void walkOut() {
		System.out.println("Show is over. Audience are leaving");
	}
	
	public void m1(ProceedingJoinPoint pj) throws Throwable  {
		System.out.println("Entering the method" ); // pre-processing logic
		pj.proceed();
		System.out.println("Exiting the method"); // post-processing logic
	}
}
