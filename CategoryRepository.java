package com.hcl.product.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hcl.product.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
