package com;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

	@Before("execution(* com.UserService.test(..))")
	public void logging() {
		LocalDateTime timestamp = LocalDateTime.now();
		System.out.println("_________"+timestamp+"_________");
	}
}
