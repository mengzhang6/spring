package meng.spring.test4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements DisposableBean, InitializingBean {

	public void defautInit() {
		System.out.println("Bean 全局初始化");
	}

	public void defaultDestroy() {
		System.out.println("Bean 全局销毁");
	}

	public void start() {
		System.out.println("配置init-method实现初始化");
	}

	public void stop() {
		System.out.println("配置destroy-method实现销毁");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("实现InitializingBean接口, 实现初始化");

	}

	public void destroy() throws Exception {
		System.out.println("实现DisposableBean接口 ,实现销毁");

	}

}
