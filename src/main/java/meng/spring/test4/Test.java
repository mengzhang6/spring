package meng.spring.test4;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 加载
		ClassPathXmlApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-lifecycle.xml
			context = new ClassPathXmlApplicationContext("classpath:spring-lifecycle.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanLifeCycle o = (BeanLifeCycle) context.getBean("beanLifeCycle", BeanLifeCycle.class);
		System.out.println(o);
		context.destroy();
	}

}
