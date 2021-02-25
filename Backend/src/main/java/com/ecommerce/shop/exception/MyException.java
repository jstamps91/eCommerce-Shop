package com.ecommerce.shop.exception;

import com.ecommerce.shop.enums.ResultEnum;

/**
 * Created by Joshua Stamps on 2/24/2021
 */
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
