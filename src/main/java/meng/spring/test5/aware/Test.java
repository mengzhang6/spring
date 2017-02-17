package meng.spring.test5.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 加载
		ApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-aware.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-aware.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AwareTest awareTest = (AwareTest) context.getBean("awareTest", AwareTest.class);
		System.out.println(awareTest.hashCode());

	}

}
