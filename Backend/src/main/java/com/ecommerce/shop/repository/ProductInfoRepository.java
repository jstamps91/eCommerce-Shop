package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Joshua Stamps on 2/24/2021.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    ProductInfo findByProductId(String id);

    // On-Sale product
    Page<ProductInfo> findAllByProductStatusOrderByProductIdAsc(Integer productStatus, Pageable pageable);

    // Product in one category
    Page<ProductInfo> findAllByCategoryTypeOrderByProductIdAsc(Integer categoryType, Pageable pageable);

    Page<ProductInfo> findAllByOrderByProductId(Pageable pageable);
}
