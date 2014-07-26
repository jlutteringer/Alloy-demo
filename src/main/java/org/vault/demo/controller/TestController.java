package org.vault.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.vault.site.controller.VaultController;

@Controller
public class TestController extends VaultController {
	@ResponseBody
	@RequestMapping("/test")
	private String test() {
		logger.debug("hello");
		return "hello";
	}
}