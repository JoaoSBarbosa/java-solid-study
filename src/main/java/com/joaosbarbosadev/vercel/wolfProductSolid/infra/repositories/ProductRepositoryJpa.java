package com.joaosbarbosadev.vercel.wolfProductSolid.infra.repositories;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductRepositoryJpa implements ProductRepository {
    private final SpringDataProductRepository jpa;

    public ProductRepositoryJpa(SpringDataProductRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public Product save(Product product) {
        return jpa.save(product);
    }

    @Override
    public List<Product> findAll() {
        return jpa.findAll();
    }

    @Override
    public Optional<Product> findById(long id) {
        return jpa.findById(id);
    }
}
