package meng.spring.test2;

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
			// /Spring_MyStudy/resources/spring-injection.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-injection.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		InjectionService service = (InjectionService) context.getBean(
				"injectionService", InjectionService.class);
		service.save("设值注入");

		InjectionService service2 = (InjectionService) context.getBean(
				"injectionService2", InjectionService.class);
		service2.save("构造注入");

	}

}
