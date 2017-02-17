package meng.spring.test15;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
@Named
public class JsrService {
	
	/**
	 * 使用@Resource和@Inject的效果和使用@Autowired的效果相同，区别尚不清楚；
	 * 且这三个注解放在变量上和放在其setting方法上，效果相同
	 */	
	@Autowired
	private JsrDao jsrDao;
	
	public void setJsrDao(@Named("jsrDao") JsrDao jsrDao) {
		this.jsrDao = jsrDao;
	}

	@Inject
	private JsrDao jsrDao2;
	
	@Resource
	private JsrDao jsrDao3;
	
	public void save(String world){
		jsrDao.save("@Autowired-"+world);
		jsrDao2.save("@Inject-"+world);
		jsrDao3.save("@Resource-"+world);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("初始化···");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("销毁···");
	}

}
