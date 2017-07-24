package meng.spring.test19.springaopapi;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
	private int count;

	public int getCount() {
		return count;
	}

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("MyAfterReturningAdvice - afterThrowing");
		System.out.println("MyAfterReturningAdvice-"
				+ target.getClass().getName());
		System.out.println("MyAfterReturningAdvice-" + method.getName());
		System.out.println("MyAfterReturningAdvice-" + args);
		++count;
	}
	
	

}
