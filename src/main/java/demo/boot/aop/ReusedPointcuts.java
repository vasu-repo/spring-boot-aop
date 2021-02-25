package demo.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

import javassist.bytecode.SignatureAttribute.MethodSignature;
/*
@Aspect
@Component
public class ReusedPointcuts {

	
Logger logger=Logger.getLogger(getClass().getName());
	
	//create pointbeforeLogin()cut
	@Pointcut("execution(public String loginHome(..))")
	public void beforeLogin() {
	}
	
	@Before("")
	public void resuseLogin() {
		System.out.println(" BEFORE ADVICE CALLED-REUSE");
	}
}*/
