package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example.demo","com.example.test"})
@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		/*String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		for (String beanName : beanDefinitionNames) {
			Arrays.sort(beanDefinitionNames);
			System.out.println(beanName);
		}*/
		
		MyAppConfiguration bean = (MyAppConfiguration)ctx.getBean("myAppConfiguration");
		System.out.println(bean.toString());
	}

}
