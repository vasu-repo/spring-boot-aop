package demo.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
/*
@Aspect
@Component
public class JoinPointExample {

	
	
Logger logger=Logger.getLogger(getClass().getName());
	
	//create pointcut
	@Pointcut("execution(public String loginHome(..))")
	public void beforeLogin() {
	}
	
	@Before("beforeLogin()")
	public void resuseLogin(JoinPoint jp) {
		System.out.println(" BEFORE ADVICE CALLED-JOIN POINT");
		MethodSignature ms=(MethodSignature) jp.getSignature();
		System.out.println( jp.getSignature());
		System.out.println( ms);
		
		Object[] args=jp.getArgs();
		for(Object o:args) {
			System.out.println("arg:"+ o);
			//do business logic here
		}

	}
}
*/