package meng.spring.test16.aop;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * 
 * @author mengzhang6
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			// /Spring_Introduction/resources/spring-aop-schema-advice.xml
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-aop-schema-advice.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AspectBiz aspectBiz = context.getBean("aspectBiz", AspectBiz.class);
		aspectBiz.biz();
		// aspectBiz.init("bao", 52);

	}

}
