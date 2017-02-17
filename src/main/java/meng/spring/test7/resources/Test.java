package meng.spring.test7.resources;

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
		// 加载
		ApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-resource.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-resource.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		ResourcesTest resourcesTest = (ResourcesTest) context.getBean(
				"resourcesTest", ResourcesTest.class);
		resourcesTest.resources();
	}

}
