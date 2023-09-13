package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Seller;
import com.devsuperior.dsmeta.projection.SellerSumProjection;

public class SellerSumDTO {
	private String name;
	private Long sum;
	
	public SellerSumDTO() {
	}

	public SellerSumDTO(String name, Long sum) {
		
		this.name = name;
		this.sum = sum;
	}
	public SellerSumDTO(Seller x) {
		name = x.getName();
		sum = x.getId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
	
			return "SellerSumDTO [name=" + name + ", sum=" + sum + "]";
		}
	}
	

