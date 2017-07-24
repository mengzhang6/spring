package meng.spring.test16.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * 
 * @author mengzhang6
 * 
 */
public class MoocAspect {

	public void before() {
		System.out.println("前置通知");
	}

	public void afterReturning() {
		System.out.println("正常返回后通知");
	}

	public void afterThrowing() {
		System.out.println("异常抛出后通知");
	}

	public void after() {
		System.out.println("无论是正常返回后还是异常抛出后都会通知···");
	}

	// 必须包含参数，第一个参数必须是ProceedingJoinPoint类型
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("环绕通知---前");
			obj = pjp.proceed();
			System.out.println("环绕通知---后");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

	public Object aroundInit(ProceedingJoinPoint pjp, String name, int count) {

		System.out.println("环绕通知:" + name + "," + count);
		Object obj = null;
		try {
			System.out.println("环绕通知---前");
			obj = pjp.proceed();
			System.out.println("环绕通知---后");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}

}
