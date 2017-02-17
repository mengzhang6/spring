 package meng.spring.test6.autowiring;

public class AutoWiringService3 {

	private AutoWiringDAO autoWiringDAO;

	/* default-autowire="constructor" 时使用到构造注入 */
	public AutoWiringService3(AutoWiringDAO autoWiringDAO) {
		System.out.println("constructor方式");
		this.autoWiringDAO = autoWiringDAO;
	}

	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
