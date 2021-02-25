package com.ecommerce.shop.form;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Joshua Stamps on 2/24/2021
 */
@Data
public class ItemForm {
    @Min(value = 1)
    private Integer quantity;
    @NotEmpty
    private String productId;
}
