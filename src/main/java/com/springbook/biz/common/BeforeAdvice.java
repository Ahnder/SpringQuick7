package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
	// xml 설정 방식
	
	//public void beforeLog(JoinPoint jp) { 
	//	String method = jp.getSignature().getName(); 
	//	Object[] args = jp.getArgs();
	//
	//	System.out.println("[사전 처리] " + method + 
	//			"() 메서드 ARGS 정보 : " + args[0].toString()); 
	//}
	
	
	// 어노테이션 방식
	// 클래스에 @Service와 @Aspect를 선언
	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리]" + method +
				"() 메서드 ARGS 정보 : " + args[0].toString());
	}
	
}
