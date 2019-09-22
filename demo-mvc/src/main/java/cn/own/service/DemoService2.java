package cn.own.service;

import cn.own.bean.Role;
import cn.own.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService2 {
	@Autowired
	private User user;

	public void setUser() {
		user.setId(3);
		user.setRole(new Role("sf","admin"));
	}
}
