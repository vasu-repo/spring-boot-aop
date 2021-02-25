package demo.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
/*
@Aspect
@Component
public class AfterAdvice {

	//like finally block
Logger logger=Logger.getLogger(getClass().getName());
	
	@After("execution(public String loginHome(..))")
	//@Before("execution(public String loginHome*(..))")
	//@Before("execution( String loginHome*(..))")
	//@Before("execution(* loginHome*(..))")
	//@Before("execution(* demo.boot.controller.LoginController.loginHome(..))")
	//@Before("execution(public String loginHome())")
	//@Before("execution(public String loginHome(*))")
	//@Before("execution(* loginHome(..))")
	//@Before("execution(public String loginHome(org.springframework.ui.ModelMap,..))")
	//@Before("execution(public String loginHome(org.springframework.ui.ModelMap))")

	public void afterLogin(JoinPoint jp) {
		System.out.println(" AFTER ADVICE IS CALLED");
		System.out.println(jp.getSignature());
	}
	
}*/
