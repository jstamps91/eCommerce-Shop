package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.Cart;
import com.ecommerce.shop.entity.ProductInOrder;
import com.ecommerce.shop.entity.User;

import java.util.Collection;

/**
 * Created by Joshua Stamps on 2/27/2021
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
