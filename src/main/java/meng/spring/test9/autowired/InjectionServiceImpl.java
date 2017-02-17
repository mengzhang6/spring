package meng.spring.test9.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

	@Autowired
	private InjectionDAO injectionDAO;

	public void save(String arg) {
		// 模拟业务操作
		System.out.println("模拟业务操作:" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}

}
