package br.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
