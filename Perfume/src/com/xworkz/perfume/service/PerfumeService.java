package com.xworkz.perfume.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.perfumedto.PerfumeDTO;
@Component
public interface PerfumeService {
	public void validateAndSave(PerfumeDTO dto);
	public Collection<PerfumeDTO> readAll();
	public boolean isExist(PerfumeDTO dto);
	public boolean updatePriceByName(String Name,int price);

}
