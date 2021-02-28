package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.User;

import java.util.Collection;

/**
 * Created by Joshua Stamps on 2/27/2021
 */
public interface UserService {

    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
