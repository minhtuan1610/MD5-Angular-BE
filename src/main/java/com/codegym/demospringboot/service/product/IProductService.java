package com.codegym.demospringboot.service.product;


import com.codegym.demospringboot.model.Product;
import com.codegym.demospringboot.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findProductByNameContaining(String name);

    Iterable<Product> findProductPriceBetween(Double min, Double max);
}
