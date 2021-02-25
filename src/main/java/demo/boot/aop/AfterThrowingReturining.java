package demo.boot.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import demo.boot.model.Todo;
/*
@Aspect
@Component
@Order(2)
public class AfterThrowingReturining {

	@AfterThrowing(
			pointcut="execution(* demo.boot.repository.*.*(..))",
			throwing="theExc")
	public void afterThrowingFindAccountsAdvice(
					JoinPoint theJoinPoint, Throwable theExc) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
		
		// log the exception
		System.out.println("\n=====>>> The exception is: " + theExc);
	
	}
	
	
	
	
	
	@AfterReturning(
			pointcut="execution(* demo.boot.repository.*.*(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
					JoinPoint theJoinPoint, List<Todo> result) {
		
		// print out which method we are advising on 
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
				
		// print out the results of the method call
		System.out.println("\n=====>>> result is: " + result);
		
		// let's post-process the data ... let's modify it :-)
		
		// convert the account names to uppercase
		convertAccountNamesToUpperCase(result);

		System.out.println("\n=====>>> result is: " + result);
		
	}

	private void convertAccountNamesToUpperCase(List<Todo> result) {

		// loop through accounts

		for (Todo todo : result) {
			
			// get uppercase version of name
			String theUpperName = todo.getUserName().toUpperCase();
			
			// update the name on the account
			todo.setUserName(theUpperName);
		}

	}

}
*/