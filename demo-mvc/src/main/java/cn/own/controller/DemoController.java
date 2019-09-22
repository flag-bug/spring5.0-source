package cn.own.controller;

import cn.own.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@Autowired
	private DemoService demoService;

	@GetMapping("/{id}")
	@ResponseBody
	public String demo(@PathVariable(value = "id") String id) {
		System.out.println("controller: " + demoService.demo(id));
		return id;
	}

	@GetMapping("/")
	@ResponseBody
	public String demo2() {
		System.out.println("controller: " + demoService.demo("~"));
		return "~";
	}
}
