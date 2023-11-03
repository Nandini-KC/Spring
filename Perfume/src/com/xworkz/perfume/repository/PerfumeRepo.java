package com.xworkz.perfume.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.perfumedto.PerfumeDTO;

@Component
public interface PerfumeRepo {
	public void save(PerfumeDTO dto);
	public Collection<PerfumeDTO> readAll();
	public Collection<PerfumeDTO> findByName(String name);
	public boolean isExist(PerfumeDTO dto);
	public boolean updatePriceByName(String Name,int price);

}
