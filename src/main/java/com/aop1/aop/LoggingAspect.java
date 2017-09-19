package com.aop1.aop;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	
//	@Before("execution(public String com.aop.impl.ToDoImpl.*(..))")
//	public void beforeMethod(JoinPoint joinPoint){
//	String methodName = joinPoint.getSignature().getName();
//	Object [] args = joinPoint.getArgs();
//
//	System.out.println("The method " + methodName + " begins with " + Arrays.asList(args));
//	}
	
	
	   //后置通知是在连接点完成之后执行的, 即连接点返回结果或者抛出异常的时候, 下面的后置通知记录了toStart() 方法的终止. 

	@After("execution(public String com.aop.impl.*.*(..))")
	public void afterMethod(JoinPoint joinPoint){
	String methodName = joinPoint.getSignature().getName();
	System.out.println("The method " + methodName + " ends");
	}
}
