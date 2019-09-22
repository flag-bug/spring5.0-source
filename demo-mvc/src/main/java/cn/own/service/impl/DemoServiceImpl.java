package cn.own.service.impl;

import cn.own.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
	@Override
	public String demo(String id) {
		System.out.println("service: " + id);
		return id;
	}
}
