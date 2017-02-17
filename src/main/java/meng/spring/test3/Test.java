package meng.spring.test3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * 测试scope
	 */
	public static void main(String[] args) {
		// 加载
		ApplicationContext context = null;
		try {
			// /Spring_MyStudy/resources/spring-beanscope.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-beanscope.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanScope bean = (BeanScope) context.getBean("beanScope",
				BeanScope.class);
		bean.say();

		BeanScope bean2 = (BeanScope) context.getBean("beanScope",
				BeanScope.class);
		bean2.say();

	}

}
