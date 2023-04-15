package com.solitudeycq;

import com.solitudeycq.config.AppConfig;
import com.solitudeycq.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.test();
	}
}
