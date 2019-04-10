package meng.spring.test1.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 加载
        ApplicationContext context = null;
        try {
            context = new ClassPathXmlApplicationContext(
                    "classpath:spring-ioc.xml");
        } catch (BeansException e) {
            e.printStackTrace();
        }

        // oneInterface2
        OneInterface o = context.getBean("oneInterface", OneInterface.class);
        o.say("只需要在spring-ioc配置文件中就可以配置使用哪一个实现类。");

    }

}
