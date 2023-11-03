package com.xworkz.movie;

import org.springframework.stereotype.Component;

@Component("telugu")
public class Telugu implements Language{

	@Override
	public void dubbing() {
		System.out.println("Movie dubbing in telugu");
		
	}

}
