package meng.spring.test19.springaopapi;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("MyThrowsAdvice - afterThrowing");
	}

	public void afterThrowing(Method method, Object[] args, Object target,
			Exception ex) throws Throwable {
		System.out.println("MyThrowsAdvice - afterThrowing 2");
		System.out.println("MyThrowsAdvice-" + target.getClass().getName());
		System.out.println("MyThrowsAdvice-" + method.getName());
		System.out.println("MyThrowsAdvice-" + args);
	}

}
