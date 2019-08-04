package com.hcl.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hcl.product.entity.ProductCount;

public interface ProductCountRepository extends JpaRepository<ProductCount, Integer>{

	@Query("select count(prodInterested) from ProductCount p where p.prodId=:prodId")
	List<?> getProductCountByProdId(int prodId);

}
