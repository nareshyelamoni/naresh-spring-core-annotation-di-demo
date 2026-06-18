package com.telusko.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.service.Telusko;

public class LaunchSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("applicationconfig.xml");
		Telusko t=con.getBean(Telusko.class);
		Boolean status=t.buyTheCourse(4452.8);
		if(status) {
			System.out.println("course enrolled successfully");
		}else {
			System.out.println("course enrolled failed");
		}
	}

}
