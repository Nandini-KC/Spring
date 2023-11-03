package com.xworkz.perfumedto;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.perfume")
public class PerfumeConfig {
	@Bean
	public ArrayList<PerfumeDTO> getArrayList()
	{
		return new ArrayList<PerfumeDTO>();
	}

}
