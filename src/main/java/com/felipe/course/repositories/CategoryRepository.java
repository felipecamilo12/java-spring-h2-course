package com.felipe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
