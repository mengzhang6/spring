package meng.spring.test13;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/config.xml
			context = new ClassPathXmlApplicationContext("classpath:config.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		MyDriverManager myDriverManager = context.getBean("myDriverManager",
				MyDriverManager.class);
		System.out.println(myDriverManager.getClass().getName());
	}

}
