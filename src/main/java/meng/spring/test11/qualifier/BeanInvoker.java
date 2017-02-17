package meng.spring.test11.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

	@Qualifier("beanOne")
	@Autowired
	private BeanInterface beanInterface;

	public void say() {
		if (null != beanInterface) {
			System.out.println(beanInterface.getClass().getName());
		}
	}
}
