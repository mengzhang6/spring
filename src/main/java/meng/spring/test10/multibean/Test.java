package meng.spring.test10.multibean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			///Spring_MyStudy/resources/spring-autowired_mutilbean.xml
			context = new ClassPathXmlApplicationContext("classpath:spring-autowired_mutilbean.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanInvoker invoker = context.getBean("beanInvoker", BeanInvoker.class);
		invoker.sayList();
		System.out.println("----");
		invoker.sayMap();
	}

}
