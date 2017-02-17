package meng.spring.test2;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDAO;

	public InjectionServiceImpl() {
		// 设值注入需要
	}
	
	// 构造器注入---有相应的构造方法
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	// 设值注入---必须有injectionDAO的set方法
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void save(String arg) {
		// 模拟业务操作
		System.out.println("模拟业务操作:" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}

}
