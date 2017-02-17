package meng.spring.test18.advisors;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
	
	public void invoke() {
		System.out.println("正常执行服务类 ......");
	}
	
	public void invokeException() {
		throw new PessimisticLockingFailureException("执行服务类异常");
	}

}
