package com.xworkz.perfume.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.repository.PerfumeRepo;
import com.xworkz.perfume.repository.PerfumeRepoImpl;
import com.xworkz.perfumedto.PerfumeDTO;

@Component
public class PerfumeServiceImpl implements PerfumeService{
	@Autowired
	private PerfumeRepo repo;
	
	@Override
	public void validateAndSave(PerfumeDTO dto) {
		
		if(dto.getBrand()!=null && dto.getBrand().length()>3)
		{
			if(dto.getPerfumeFragrance()!=null && dto.getPerfumeFragrance().length()>3)
			{
				if(dto.getPrice()>500 && dto.getPrice()!=0)
				{
					if(dto.getQuantity()>100 && dto.getQuantity()!=0)
					{
						repo.save(dto);
						repo.isExist(dto);

						System.out.println("Validate data succesfull and saving");
					}
				}
			}
		}
		
		
	}

	@Override
	public Collection<PerfumeDTO> readAll() {
		
		return repo.readAll();
	}

	@Override
	public boolean isExist(PerfumeDTO dto) {
			return repo.isExist(dto);
		
		
	}

	@Override
	public boolean updatePriceByName(String Name, int price) {
	
		return repo.updatePriceByName(Name, price);
	}

	

}
