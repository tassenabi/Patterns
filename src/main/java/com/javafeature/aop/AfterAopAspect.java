package com.javafeature.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	//Pointcut
	@AfterReturning(value = "execution(* com.javafeature.aop.services.Service1.findSomething(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} I m the AfterReturning {}", joinPoint, result);
	}

	//Pointcut
	@After(value = "execution(* com.javafeature.aop.services.Service1.findSomething(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("I am the after execution of {}", joinPoint);
	}
}