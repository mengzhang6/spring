package meng.spring.test12.bean;

public class StringStore implements Store {

	public void init() {
		System.out.println("这是初始化");
	}

	public void destroy() {
		System.out.println("这是销毁");
	}

}
