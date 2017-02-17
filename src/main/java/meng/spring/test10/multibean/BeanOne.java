package meng.spring.test10.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)//设置顺序
@Component
public class BeanOne implements BeanInterface{

	public void hello() {
		System.out.println("hello this is one.");
		
	}

}
