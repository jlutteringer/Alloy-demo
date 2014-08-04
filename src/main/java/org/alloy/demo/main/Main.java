package org.alloy.demo.main;

import org.alloy.boot.application.AlloyApplication;

public class Main {
	public static void main(String[] args) {
		System.setProperty("environment", "dev");
		AlloyApplication.run(args);
	}
}