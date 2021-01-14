package com.cluster;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
@Aspect
public class Audience {
	
	/*	
	 	// before advice 
		@Before(value="execution(public * com.cluster.Juggler.*(..))")
		public void takeSeats() {
			System.out.println("The audience is taking their seats.");
		}
	*/	
	
	/*
	 	// after returning advice
		@AfterReturning(value="execution(public * com.cluster.Juggler.*(..))")
		public void applaud() {
			System.out.println("CLAP CLAP CLAP CLAP CLAP");
		}
	*/

	/*
		// after throwing advice
		@AfterThrowing(value="execution(public * com.cluster.Juggler.*(..))")
		public void demandRefund() {
			System.out.println("Boo! We want our money back!");
		}
	*/
	
	/*
		// after (finally) advice
		@After(value="execution(public * com.cluster.Juggler.*(..))")
		public void walkOut() {
			System.out.println("Show is over. Audience are leaving");
		}
	*/
	
	/*
		// around advice
		@Around(value="execution(public * com.cluster.Juggler.*(..))")
		public void m1(ProceedingJoinPoint pj) throws Throwable 
		{
			System.out.println("Entering the method" ); // pre-processing logic
			pj.proceed();
			System.out.println("Exiting the method"); // post-processing logic
		}
	*/
}
