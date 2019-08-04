package com.hcl.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.product.entity.Category;

@Service

public interface CategoryService {

	public List<Category> getCagetories();

	public Category getCategoryByCateId(int categoryId);
	
	public List<?> getAnalyticsByCategory(int categoryById);


}
