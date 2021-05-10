package com.lip6.aop;

import java.util.Calendar;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopTester {
	
	/*public void aurevoir() {
		System.out.println("--------------------Au revoir!!!!-------------------");
	}*/

	/*public void aurevoir(ProceedingJoinPoint pjp) throws Throwable {
		if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)>12)
		{
		System.out.println("--------------------Au revoir!!!!-------------------");
		}
		else
		pjp.proceed();
		
	}*/
	
	public void aurevoir(ProceedingJoinPoint pjp, String prenom) throws Throwable {
		if(prenom.equals("Lucile"))
		{
		System.out.println("--------------------Au revoir "+prenom+ " -------------------");
		}
		else
		pjp.proceed();
	
	}
}
