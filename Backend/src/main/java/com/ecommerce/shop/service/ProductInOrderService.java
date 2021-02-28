package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.ProductInOrder;
import com.ecommerce.shop.entity.User;

/**
 * Created by Joshua Stamps on 2/27/2021
 */
public interface ProductInOrderService {

    void update(String itemId, Integer quantity, User user);

    ProductInOrder findOne(String itemId, User user);
}
