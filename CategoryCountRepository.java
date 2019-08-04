package com.hcl.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hcl.product.entity.CategoryCount;

@Repository
public interface CategoryCountRepository extends JpaRepository<CategoryCount, Integer>{
	
	@Query("select count(categoryInterest) FROM CategoryCount cc WHERE cc.categoryId= :categoryId")
	public List<?> getCategoryCountByCategoryId(int categoryId);

	@Query(value="select * FROM category_count cc WHERE cc.categoryId= :category_id and cc.userId=:user_id",nativeQuery=true)
	public CategoryCount getCategoryCountByCategoryIdAndUserId(@Param("categoryId") int categoryId,@Param("userId") int userId);
	
}
