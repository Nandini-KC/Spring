package com.xworkz.perfume.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.perfumedto.PerfumeDTO;
@Component
public class PerfumeRepoImpl implements PerfumeRepo {

	@Autowired
	private Collection<PerfumeDTO> perfumes;
	@Override
	public void save(PerfumeDTO dto) {
		
		if(dto!=null)
		{
			perfumes.add(dto);
			System.out.println("Saved into collection");
		}
		
	}
	@Override
	public Collection<PerfumeDTO> findByName(String name) {
		if(name!=null)
		{
		List<PerfumeDTO> perfume=perfumes.stream().filter(v->v.getBrand().equals("Fogg")).collect(Collectors.toList());
		perfume.forEach(v->System.out.println(v));
		}
		return null;
	}
	
	@Override
	public Collection<PerfumeDTO> readAll() {
		
		return perfumes;
	}
	@Override
	public boolean isExist(PerfumeDTO dto) {
		Collection<PerfumeDTO> list=perfumes;
		for(PerfumeDTO perfume : list)
		{
			if(perfume.getBrand().contains(dto.getBrand()))
			{
				if(perfume.getPerfumeFragrance().contains(dto.getPerfumeFragrance()))
				{
					return true ;
				}
			}
		}
		return false;
	}
	@Override
	public boolean updatePriceByName(String Name, int price) {
		for(PerfumeDTO perfume:perfumes)
		{
			if(perfume.getBrand().equals(Name))
			{
				perfume.setPrice(price);
				return true;
			}
		}
		return false;
	}
	

}
