package meng.spring.test8.annotation;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-beanannotation.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-beanannotation.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanAnnotation beanAnnotation = context.getBean("beanAnnotation",
				BeanAnnotation.class);
		beanAnnotation.say("Hello 注解bean");
		System.out.println(beanAnnotation.hashCode());

		BeanAnnotation beanAnnotation2 = context.getBean("beanAnnotation",
				BeanAnnotation.class);
		beanAnnotation2.say("Hello 注解bean");
		System.out.println(beanAnnotation2.hashCode());
	}

}
