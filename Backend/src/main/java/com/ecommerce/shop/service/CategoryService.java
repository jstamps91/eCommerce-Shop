package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.ProductCategory;

import java.util.List;

/**
 * Created by Joshua Stamps on 2/27/2021
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
