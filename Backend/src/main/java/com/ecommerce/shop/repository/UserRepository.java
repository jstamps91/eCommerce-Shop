package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created By Joshua Stamps on 2/24/2021
 */
public interface UserRepository extends JpaRepository<User, String> {
    User findByEmail(String email);
    Collection<User> findAllByRole(String role);
}