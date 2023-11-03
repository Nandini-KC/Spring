package com.xworkz.movie;

import org.springframework.stereotype.Component;

@Component("tamil")
public class Tamil implements Language{

	@Override
	public void dubbing() {
		System.out.println("Dubbing tamil movie");
	}

}
