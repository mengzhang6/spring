package meng.spring.test9.autowired;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
	
	public void save(String arg) {
		System.out.println("模拟保存数据:" + arg);
	}

}
