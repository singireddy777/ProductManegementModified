package com.hcl.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.product.entity.Product;
import com.hcl.product.entity.ProductCount;
import com.hcl.product.repository.ProductCountRepository;
import com.hcl.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired ProductRepository productRepo;
	@Autowired ProductCountRepository productCountRepo;
	public List<Product> productList() {
		return productRepo.findAll();
		
	}

	@Override
	public Product getProductByProdId(int productId) {
		
		Product product = productRepo.findById(productId).get();
		ProductCount productCount = new ProductCount();
		productCount.setProductCount(1);
		productCount.setProdInterested("interested");
		productCount.setUserId(1);
		productCountRepo.save(productCount);
		return product;	
	}

	@Override
	public List<?> getAnalyticsProdInterested(int prodId) {
		return productCountRepo.getProductCountByProdId(prodId);
	}	
	
}
