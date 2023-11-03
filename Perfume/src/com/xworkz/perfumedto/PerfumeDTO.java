package com.xworkz.perfumedto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PerfumeDTO implements Serializable{
	private String brand;
	private int price;
	private String perfumeFragrance;
	private int quantity;

}
