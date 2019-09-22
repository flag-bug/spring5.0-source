package cn.own;

import cn.own.bean.User;
import cn.own.service.DemoService2;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tests {
	@Test
	public void spring() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = app.getBean(User.class);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getList());
		System.out.println(user.getMap());
		System.out.println(user.getRole());
	}
	@Test
	public void spring_anno() {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-anno.xml");
		DemoService2 service2 = app.getBean(DemoService2.class);
		service2.setUser();
		User user = app.getBean(User.class);
		System.out.println(user.getId());
		System.out.println(user.getRole());
	}
}
