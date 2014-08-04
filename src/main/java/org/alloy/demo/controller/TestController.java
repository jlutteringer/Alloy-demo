package org.alloy.demo.controller;

import org.alloy.site.controller.AlloyController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController extends AlloyController {
	@ResponseBody
	@RequestMapping("/test")
	private String test() {
		logger.debug("hello");
		return "hello";
	}
}