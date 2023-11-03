package com.xworkz.movie;

import org.springframework.stereotype.Component;

@Component("hindi")
public class Hindi implements Language{

	@Override
	public void dubbing() {
		System.out.println("Dubbing hindi movie");
		
	}

}
