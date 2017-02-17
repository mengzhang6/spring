package meng.spring.test8.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value="prototype")//默认为单例 singleton 可以改为prototype
@Component("beanAnnotation")//默认就是beanAnnotation
public class BeanAnnotation {
	
	public void say(String arg) {
		System.out.println("BeanAnnotation : " + arg);
	}
	
	public void getHashCode() {
		System.out.println("BeanAnnotation : " + this.hashCode());
	}
	
}
