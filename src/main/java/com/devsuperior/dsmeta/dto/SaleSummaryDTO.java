package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

public class SaleSummaryDTO {
	
	private String sellerName;
	private Double total;
	
	
	
	public SaleSummaryDTO(SaleSummaryDTO x) {
		total = x.getTotal();
		sellerName = x.getSellerName();
	}

	public SaleSummaryDTO( String sellerName, Double total) {	
		this.sellerName = sellerName;
		this.total = total;
		
	}
	

	public SaleSummaryDTO(Sale entity) {	
		total = entity.getAmount();
		sellerName = entity.getSeller().getName();
		
	}
	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "SaleSummaryDTO [sellerName=" + sellerName + ", total=" + total +"]";
	}



	

	
}
