package meng.spring.test15;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {
	
	public void save(String world){
		System.out.println("JsrDao:"+world);
	}

}
