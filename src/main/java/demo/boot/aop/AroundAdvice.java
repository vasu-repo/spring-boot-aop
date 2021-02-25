package demo.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jboss.logging.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
/*
@Aspect
@Component
@Order(1)
public class AroundAdvice {

Logger logger=Logger.getLogger(getClass().getName());
	
@Around("execution(public String loginHome(..))")	
public Object aroundGetFortune(
		ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
	
	// print out method we are advising on
	String method = theProceedingJoinPoint.getSignature().toShortString();
	System.out.println("\n=====>>> Executing @Around on method: " + method);
	
	// get begin timestamp
	long begin = System.currentTimeMillis();
	
	// now, let's execute the method
	Object result = theProceedingJoinPoint.proceed();
	
	// get end timestamp
	long end = System.currentTimeMillis();
	
	// compute duration and display it
	long duration = end - begin;
	System.out.println("\n=====> Duration: " + duration / 1000.0 + " seconds");
	
	return result;
}

	
}
*/