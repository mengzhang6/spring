package meng.spring.test11.qualifier;

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
			// /Spring_MyStudy/resources/spring-autowired_qualifier.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowired_qualifier.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanInvoker invoker = context.getBean("beanInvoker", BeanInvoker.class);
		invoker.say();
	}

}
