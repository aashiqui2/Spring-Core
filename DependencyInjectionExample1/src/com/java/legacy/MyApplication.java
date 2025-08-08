package com.java.legacy;

public class MyApplication {

	//private EmailService email = new EmailService();
	
	private EmailService email;
	public MyApplication(EmailService svc) {
		this.email = svc;
	}
	

	public void processMessages(String msg, String rec) {
		this.email.sendEmail(msg, rec);
	}
}
