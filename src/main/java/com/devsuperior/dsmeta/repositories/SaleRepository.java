package com.devsuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsmeta.entities.Sale;



public interface SaleRepository extends JpaRepository<Sale, Long> {


	@Query(value ="SELECT obj FROM Sale obj JOIN FETCH obj.seller "
			+ "WHERE obj.date >= :min "
			+ "AND obj.date <= :max "
			+ "AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%'))",
			countQuery ="SELECT COUNT(obj) FROM Sale obj JOIN obj.seller "
			+" WHERE obj.date>= :min "
			+"AND obj.date <= :max "
			+"AND UPPER(obj.seller.name) LIKE UPPER(CONCAT('%', :name, '%'))")			
	Page<Sale> searchSales(LocalDate min, LocalDate max, String name, Pageable pageable);
	
	
	@Query(value ="SELECT obj FROM Sale obj JOIN FETCH obj.seller "
			+"SUM((obj.amount) WHERE obj.date BETWEEN :min AND obj.date :max )"
			+"GROUP BY obj.seller.name" ,	
			countQuery ="SELECT COUNT(obj) FROM Sale obj JOIN obj.seller "
		  +"SUM((obj.amount) WHERE obj.date BETWEEN  :min AND obj.date :max )"
            +"GROUP BY obj.seller.name" )		
	Page<Sale> searchSummary(LocalDate min, LocalDate max, Pageable pageable);
	
}
