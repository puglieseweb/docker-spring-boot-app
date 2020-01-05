package com.puglieseweb.apps.services;


import com.puglieseweb.apps.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
