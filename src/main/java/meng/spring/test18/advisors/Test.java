package meng.spring.test18.advisors;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mengzhang6
 * 
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-aop-schema-advisors.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		InvokeService invokeService = (InvokeService) context
				.getBean("invokeService");
		// 测试场景1：正常执行
		// invokeService.invoke();
		// 测试场景2：异常执行
		invokeService.invokeException();
	}

}
