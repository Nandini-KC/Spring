package com.xworkz.festival.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.Diwali;
import com.xworkz.festival.Dussehra;
import com.xworkz.festival.Festival;
import com.xworkz.festival.GaneshaFestival;
import com.xworkz.festival.Holi;
import com.xworkz.festival.KrishnaJanmashtami;
import com.xworkz.festival.MahaSivaRathri;
import com.xworkz.festival.Ramzan;
import com.xworkz.festival.Sankranthi;
import com.xworkz.festival.SreeRamaNavami;
import com.xworkz.festival.Ugadhi;

public class FestivalRunner {

	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(FestivalConfig.class);
	Festival fest=context.getBean(Dussehra.class);
	fest.celebrate();
	fest.doPooja();
	System.out.println();
	
	
	Festival fest1=context.getBean(Diwali.class);
	fest1.celebrate();
	fest1.doPooja();
	System.out.println();
	
	
	Festival fest2=context.getBean(GaneshaFestival.class);
	fest2.celebrate();
	fest2.doPooja();
	System.out.println();
	
	Festival fest3=context.getBean(Holi.class);
	fest3.celebrate();
	fest3.doPooja();
	System.out.println();
	
	Festival fest4=context.getBean(KrishnaJanmashtami.class);
	System.out.println();
	fest4.celebrate();
	fest4.doPooja();
	
	
	Festival fest5=context.getBean(SreeRamaNavami.class);
	System.out.println();
	fest5.celebrate();
	fest5.doPooja();
	
	Festival fest6=context.getBean(Ramzan.class);
	System.out.println();
	fest6.celebrate();
	fest6.doPooja();
	
	Festival fest7=context.getBean(MahaSivaRathri.class);
	System.out.println();
	fest7.celebrate();
	fest7.doPooja();
	
	Festival fest8=context.getBean(Ugadhi.class);
	System.out.println();
	fest8.celebrate();
	fest8.doPooja();
	
	Festival fest9=context.getBean(Sankranthi.class);
	System.out.println();
	fest9.celebrate();
	fest9.doPooja();
	
	

	}

}
