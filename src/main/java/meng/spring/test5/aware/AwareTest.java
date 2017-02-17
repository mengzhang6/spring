package meng.spring.test5.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareTest implements BeanNameAware, ApplicationContextAware {

	private String beanName;
	private ApplicationContext applicationContext;

	public void setBeanName(String name) {
		this.beanName = name;
		System.out.println("实现BeanNameAware获取bean的名字" + name);
	}

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		System.out
				.println("实现ApplicationContextAware获取 applicationContext，实例化bean: "
						+ this.applicationContext.getBean(this.beanName)
								.hashCode());
	}

}
