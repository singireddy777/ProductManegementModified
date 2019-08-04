package com.hcl.product.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.hcl.product.entity.Product;

@Service
public interface ProductService {

	public List<Product> productList();
	public Product getProductByProdId(int productId);
	public List<?> getAnalyticsProdInterested(int prodId);
}
