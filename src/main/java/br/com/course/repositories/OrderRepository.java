package br.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
