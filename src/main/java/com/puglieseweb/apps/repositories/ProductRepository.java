package com.puglieseweb.apps.repositories;

import com.puglieseweb.apps.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
