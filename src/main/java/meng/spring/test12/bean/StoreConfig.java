package meng.spring.test12.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StoreConfig {

	/**
	 * bean的默认名称为方法名，当定义name属性时，bean的名称改为stringStore
	 * 
	 * @return StringStore对象
	 */
	@Scope(value="prototype")//,proxyMode=ScopedProxyMode.TARGET_CLASSs
	@Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
	public Store getStringStore() {
		return new StringStore();
	}

}
