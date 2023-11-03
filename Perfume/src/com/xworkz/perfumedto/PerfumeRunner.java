package com.xworkz.perfumedto;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.repository.PerfumeRepo;
import com.xworkz.perfume.repository.PerfumeRepoImpl;
import com.xworkz.perfume.service.PerfumeService;
import com.xworkz.perfume.service.PerfumeServiceImpl;

public class PerfumeRunner {

	public static void main(String[] args) {
		PerfumeDTO dto=new PerfumeDTO("Fogg", 700, "FLower", 200);
		PerfumeDTO dto1=new PerfumeDTO("Wild Stone", 900, "woody", 300);
		
		ApplicationContext context=new AnnotationConfigApplicationContext(PerfumeConfig.class);
		PerfumeService service=context.getBean(PerfumeServiceImpl.class);
		PerfumeRepo repo=context.getBean(PerfumeRepoImpl.class);
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
		
		repo.findByName("Fogg");
		Collection<PerfumeDTO> read=service.readAll();
		System.out.println(read);
		
		boolean exist=service.isExist(dto);
		System.out.println(exist);
		
		boolean update=service.updatePriceByName("Fogg", 950);
		Collection<PerfumeDTO> saved=service.readAll();
		System.out.println(saved);
		
		
	}

}
