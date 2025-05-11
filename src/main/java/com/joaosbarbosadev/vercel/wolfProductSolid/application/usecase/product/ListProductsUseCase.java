package com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product.ProductMapper;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository.ProductRepository;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;

import java.util.List;
import java.util.stream.Collectors;

public class ListProductsUseCase {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ListProductsUseCase(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductResponse> execute() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }
}
