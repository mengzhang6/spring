package meng.spring.test12.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-bean.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-bean.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		Store store = context.getBean("stringStore", Store.class);
		System.out.println(store.hashCode());
		Store store2 = context.getBean("stringStore", Store.class);
		System.out.println(store2.hashCode());
		
//		System.out.println(store.getClass().getName());
		context.destroy();
	}

}
