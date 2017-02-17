package meng.spring.test17.aop;

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
					"classpath:spring-aop.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		Fit  fit= (Fit)context.getBean("aspectBiz");
		fit.filter();
		
	}

}
