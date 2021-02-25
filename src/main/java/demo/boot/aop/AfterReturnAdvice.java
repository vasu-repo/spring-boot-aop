
package demo.boot.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import demo.boot.model.Todo;
/*
@Aspect
@Component
@Order(2)
public class AfterReturnAdvice {

	

	@AfterReturning(
			pointcut="execution(* demo.boot.repository.*.*(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
					JoinPoint theJoinPoint, List<Todo> result) {
		
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
				
		// print out the results of the method call
		System.out.println("\n=====>>> result is: " + result);
	

		System.out.println("\n=====>>> result is: " + result);
		
	}
}
*/