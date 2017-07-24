package meng.spring.test16.aop;

/**
 * 业务类
 * 
 * @author mengzhang6
 * 
 */
public class AspectBiz {

	public void biz() {
		System.out.println("业务类: biz");
		// 测试 aop:after-throwing
		 throw new RuntimeException();
	}

	public void init(String name, int count) {
		System.out.println("业务类:" + name + "," + count);
	}

}
