package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Joshua Stamps on 2/24/2021.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}