package com.xworkz.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tollywood implements Movie{
	@Autowired
	@Qualifier("telugu")
	private Language language;
	
	@Override
	public void produce() {
		System.out.println("produce Tollywood movie");
		
	}

	@Override
	public void promote() {
		System.out.println("Promoting Tollywood movie");
		
	}

	@Override
	public void release() {
		System.out.println("Release Tollywood movie");
		
	}

}
