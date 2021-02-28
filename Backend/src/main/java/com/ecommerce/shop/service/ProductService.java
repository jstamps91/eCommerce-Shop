package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.ProductInfo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by Joshua Stamps on 2/27/2021
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    // All products for sale
    Page<ProductInfo> findUpAll(Pageable pageable);

    // All products
    Page<ProductInfo> findAll(Pageable pageable);

    // All products in selected category
    Page<ProductInfo> findAllInCategory(Integer categoryType, Pageable pageable);

    // Increase stock
    void increaseStock(String productId, int amount);

    // Decrease stock
    void decreaseStock(String productId, int amount);

    ProductInfo offSale(String productId);
    ProductInfo onSale(String productId);
    ProductInfo update(ProductInfo productInfo);
    ProductInfo save(ProductInfo productInfo);

    void delete(String productId);
}
