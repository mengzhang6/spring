package meng.spring.test15;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-jsr.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-jsr.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		JsrService  jsrService= context.getBean("jsrService", JsrService.class);
		jsrService.save("meng");
		context.destroy();
	}

}
