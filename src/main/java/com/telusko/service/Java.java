package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Java implements ICourse {

	public Java() {
		System.out.println("Java class is called..........");
	}

	@Override
	public Boolean getCourse(Double amount) {
		System.out.println("Java course is enrolled successfully with an amount of "+amount);
		return true;
	}

}
