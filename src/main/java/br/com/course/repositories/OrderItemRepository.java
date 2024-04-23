package br.com.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.course.entities.OrderItem;
import br.com.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
