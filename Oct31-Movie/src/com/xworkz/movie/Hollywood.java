package com.xworkz.movie;

import org.springframework.stereotype.Component;

@Component
public class Hollywood implements Movie{

	@Override
	public void produce() {
		System.out.println("produce Hollywood movie");
		
	}

	@Override
	public void promote() {
		System.out.println("Promoting Hollywood movie");
		
	}

	@Override
	public void release() {
		System.out.println("Release Hollywood movie");
		
	}

}
