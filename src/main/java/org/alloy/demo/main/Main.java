package org.alloy.demo.main;

import org.alloy.boot.application.AlloyBootApplicationRunner;

public class Main {
	public static void main(String[] args) {
		System.setProperty("environment", "dev");
		AlloyBootApplicationRunner.run(args);
	}
}