 package meng.spring.test6.autowiring;

public class AutoWiringService {

	private AutoWiringDAO autoWiringDAO;

	/* default-autowire="byName" 和 default-autowire="byType"  时会使用到设置注入 */
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("byName和byType");
		this.autoWiringDAO = autoWiringDAO;
	}

	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
