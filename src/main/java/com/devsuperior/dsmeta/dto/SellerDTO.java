package com.devsuperior.dsmeta.dto;


import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsmeta.entities.Seller;

public class SellerDTO {
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name, String email, String phone, List<SaleMinDTO> sales ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public SellerDTO(Seller seller) {
		
		id = seller.getId();
		name = seller.getName();
	    email =seller.getEmail();
	    phone = seller.getPhone();
	   // seller.getSales().stream().map(x -> new SellerDTO()).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	
}
