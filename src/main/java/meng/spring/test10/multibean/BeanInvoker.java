package meng.spring.test10.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

	@Autowired
	private List<BeanInterface> list;
	@Autowired
	private Map<String,BeanInterface> map;

	public void sayList() {
		if (null != list) {
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}
		}else{
			System.out.println("list is null.");
		}
	}
	
	public void sayMap() {
		if (null != map) {
			for (String key : map.keySet()) {
				System.out.println(key+":"+map.get(key).getClass().getName());
			}
		}else{
			System.out.println("maps is null.");
		}
	}
}
