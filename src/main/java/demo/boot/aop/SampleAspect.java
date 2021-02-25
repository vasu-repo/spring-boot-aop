package demo.boot.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import demo.boot.model.Todo;

@Aspect
@Component
public class SampleAspect {
	
	Logger logger=Logger.getLogger(getClass().getName());

	//setup pointcut declaration
	@Pointcut("execution(* demo.boot.controller.*.*(..))")
	private void controllerPackage() {
		
	}
	@Pointcut("execution(* demo.boot.repository.*.*(..))")
	private void repoPackage() {
		
	}
	
	@Pointcut("execution(* demo.boot.*.*(..))")
	private void basePackage() {
		
	}
	@Pointcut("controllerPackage() || repoPackage()")
	private void forAppflow() {
		
	}
	
  // add before advice
	@Before("forAppflow()")
	public void beforeAdvice(JoinPoint joinPoint) {
		//log method calling 
		String methodName=joinPoint.getSignature().toShortString();
		logger.info (" BEFORE CALLING METHOD"+methodName);
		//log arguments
		
		Object[] args=joinPoint.getArgs();
		for(Object obj:args)
			logger.info (" ARGUMENTS"+obj);

	}
	// add @AfterReturning advice
		@AfterReturning(pointcut="forAppflow()",returning="theResult")
		public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		
			// display method we are returning from
			String theMethod = theJoinPoint.getSignature().toShortString();
			logger.info("=====>> in @AfterReturning: from method: " + theMethod);
					
			// display data returned
			logger.info("=====>> result: " + theResult);
		
		}
	
}






/*
@Before(value = "execution(* demo.boot.repository*(..)) and args(name,empId)")
public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
	System.out.println("Before method:" + joinPoint.getSignature());

	System.out.println("Creating Employee with name - " + name + " and id - " + empId);
}

@After(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
	System.out.println("After method:" + joinPoint.getSignature());

	System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
}*/
