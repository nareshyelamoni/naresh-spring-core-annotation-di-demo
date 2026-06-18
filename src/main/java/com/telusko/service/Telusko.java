package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class Telusko {
	private ICourse course;
	
	public Telusko(){
		System.out.println("Telusko class is called........");
	}
	@Autowired
	public Telusko(@Qualifier("springBoot") ICourse course) {
		System.out.println("constructor called..........");
		this.course = course;
	}
	@Autowired
	@Qualifier("java")
	public void setCourse(ICourse course) {
		System.out.println("setter called.......");
		this.course = course;
	}
	
	public Boolean buyTheCourse(Double amount) {
		return course.getCourse(amount);
	}
}
