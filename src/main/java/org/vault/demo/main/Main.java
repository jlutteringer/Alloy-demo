package org.vault.demo.main;

import org.vault.boot.application.VaultApplication;

public class Main {
	public static void main(String[] args) {
		System.setProperty("environment", "dev");
		VaultApplication.run(args);
	}
}