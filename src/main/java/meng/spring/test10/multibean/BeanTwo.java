package meng.spring.test10.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class BeanTwo implements BeanInterface{

	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello this is two");
	}

}
