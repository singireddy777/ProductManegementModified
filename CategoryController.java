package com.hcl.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.entity.Category;
import com.hcl.product.service.CategoryService;

@RestController
public class CategoryController {	
	@Autowired CategoryService  categoryService;
	
	@GetMapping("/categories/allCategories")
	public List<Category> getAllCagetories(){
		
		return categoryService.getCagetories();
	}
	
	@GetMapping("/getCategoryById/{categoryId}")
	public Category getCategoryByCategoryId(@PathVariable ("categoryId") int categoryId) {
		
		return categoryService.getCategoryByCateId(categoryId);
		
	}
		@GetMapping("/analytics/category/{categoryId}")
		
		public ResponseEntity<?> getCategoryInterests(@PathVariable int categoryId){
			
			return new ResponseEntity<>(categoryService.getAnalyticsByCategory(categoryId),HttpStatus.OK);
		}
	}

