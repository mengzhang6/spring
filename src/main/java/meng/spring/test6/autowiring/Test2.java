package meng.spring.test6.autowiring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 加载
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowiring2.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AutoWiringService autoWiringService = (AutoWiringService) context.getBean(
				"autoWiringService", AutoWiringService.class);
		System.out.println(autoWiringService.hashCode());
	}

}
