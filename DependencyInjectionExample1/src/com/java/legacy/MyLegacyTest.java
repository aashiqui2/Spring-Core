package com.java.legacy;

public class MyLegacyTest {
	public static void main(String[] args) {
		//MyApplication app = new MyApplication();
		MyApplication app = new MyApplication(new EmailService());
		app.processMessages("Hi Pankaj", "pankaj@abc.com");
	}
}
