package com.xworkz.movie;

import org.springframework.stereotype.Component;

@Component
public class Bollywood implements Movie{

	@Override
	public void produce() {
		System.out.println("produce Bollywood movie");
		
	}

	@Override
	public void promote() {
		System.out.println("Promoting Bollywood movie");
		
	}

	@Override
	public void release() {
		System.out.println("Release Bollywood movie");
		
	}

}
