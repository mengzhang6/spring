package meng.spring.test14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

	@Autowired
	private Store<String> s1;
	@Autowired
	private Store<Integer> s2;

	@Bean
	public StringStore getStringStore() {
		return new StringStore();
	}
	@Bean
	public IntegerStore getIntegerStore() {
		return new IntegerStore();
	}

	@Bean(name = "stringStore")
	public Store stringStore() {
		System.out.println(s1.getClass().getName());
		System.out.println(s2.getClass().getName());
		return new StringStore();
	}

}
