package meng.spring.test19.springaopapi;

public class BizLogicImpl implements BizLogic {

	@Override
	public String save() {
		System.out.println("BizLogicImpl save");
		return "BizLogicImpl save";
	}

}
