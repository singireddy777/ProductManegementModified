package com.hcl.product.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.entity.Product;
import com.hcl.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired ProductService productService;
	
	@GetMapping("products/allproducts")
	public List<Product>getAllProducts() {
		
		return productService.productList();
	}
	@GetMapping("/getProductById/{productId}")
	public Product getProductByProductId(@PathVariable ("productId") int productId ) {

		return productService.getProductByProdId(productId);
	}
	
	@GetMapping("/productAnalytics/product/{productId}")
	public ResponseEntity<List<?>>getProdInterestCount(@PathVariable int productId){
		
		return new ResponseEntity<List<?>>(productService.getAnalyticsProdInterested(productId),HttpStatus.OK);
		
	}
}
