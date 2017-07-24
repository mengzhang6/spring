package meng.spring.test19.springaopapi;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("MyBeforeAdvice-" + target.getClass().getName());
		System.out.println("MyBeforeAdvice-" + method.getName());
		System.out.println("MyBeforeAdvice-" + args);

	}

}
