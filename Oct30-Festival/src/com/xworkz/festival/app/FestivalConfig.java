package com.xworkz.festival.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.festival.Diwali;
import com.xworkz.festival.Dussehra;
import com.xworkz.festival.GaneshaFestival;
import com.xworkz.festival.Holi;
import com.xworkz.festival.KrishnaJanmashtami;
import com.xworkz.festival.MahaSivaRathri;
import com.xworkz.festival.Ramzan;
import com.xworkz.festival.Sankranthi;
import com.xworkz.festival.SreeRamaNavami;
import com.xworkz.festival.Ugadhi;
@Configuration
public class FestivalConfig {
	@Bean
	public Dussehra getDussehra()
	{
		return new Dussehra();
	}
	@Bean
	public Diwali getDiwali()
	{
		return new Diwali();
	}
	@Bean
	public GaneshaFestival getGaneshaFestival()
	{
		return new GaneshaFestival();
	}
	@Bean
	public Holi getHoli()
	{
		return new Holi();
	}
	@Bean
	public KrishnaJanmashtami getKrishnaJanmashtami()
	{
		return new KrishnaJanmashtami();
	}
	@Bean
	public MahaSivaRathri getMahaSivaRathri()
	{
		return new MahaSivaRathri();
		
	}
	@Bean
	public Ramzan getRamzan()
	{
		return new Ramzan();
	}
	@Bean
	public Sankranthi getSankranthi()
	{
		return new Sankranthi();
	}
	@Bean
	public SreeRamaNavami getSreeRamaNavami()
	{
		return new SreeRamaNavami();
	}
	@Bean
	public Ugadhi getUgadhi()
	{
		return new Ugadhi();
	}
}
