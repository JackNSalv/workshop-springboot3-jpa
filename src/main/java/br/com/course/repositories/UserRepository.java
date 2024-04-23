package br.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
