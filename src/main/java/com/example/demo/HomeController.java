package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.NotificationService;

@RestController
public class HomeController {
	
	
	/*//Way #1 
	@Autowired
	NotificationService notificationService;*/
	
	/*//Way #2
	private NotificationService notificationService;
	@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}*/
	
	//Way#3
	private NotificationService notificationService;
	@Autowired
	public HomeController(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	@Value("${pageController.msg}")
	private String pageControllerMsg;
	

	@RequestMapping("/")
	public String home() {
		return notificationService.toString();
	}
	
	@RequestMapping("/home")
	public String helloHome() {
		return pageControllerMsg;
	}
	
	@Value("${my.secret}")
	private String secret;
	
	@RequestMapping("/secret")
	public String secret() {
		return secret;
	}
	
	@Value("${app.name}")
	private String appName;
	
	@RequestMapping("/appName")
	public String appName() {
		return appName;
	}
	
	@Value("${app.description}")
	private String appDescription;
	
	@RequestMapping("/appDescription")
	public String appDescription() {
		return appDescription;
	}
	

}
