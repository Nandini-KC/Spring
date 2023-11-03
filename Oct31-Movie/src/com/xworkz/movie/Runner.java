package com.xworkz.movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MovieConfig.class);
		Movie movie=context.getBean(Tollywood.class);
		movie.produce();
		movie.promote();
		movie.release();

	}

}
