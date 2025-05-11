package com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(long id);
}
