package meng.spring.test7.resources;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourcesTest implements ApplicationContextAware{
	
	private ApplicationContext applicationContext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resources() throws IOException{
//		Resource resource = applicationContext.getResource("config.properties");
//		Resource resource = applicationContext.getResource("file:E:\\Workspaces\\myeclipse\\Spring_MyStudy\\resources\\config.properties");
		Resource resource = applicationContext.getResource("url:http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
