package com.dependencyinjection.injector;

import com.dependencyinjection.consumer.Consumer;
import com.dependencyinjection.consumer.MyDIApplication;
import com.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
