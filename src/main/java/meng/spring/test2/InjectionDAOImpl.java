package meng.spring.test2;

public class InjectionDAOImpl implements InjectionDAO {
	
	public void save(String arg) {
		//模拟保存数据
		System.out.println("保存-" + arg);
	}

}
