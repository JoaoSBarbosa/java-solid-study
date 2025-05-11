package com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product.ProductMapper;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository.ProductRepository;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.validator.ProductValidator;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductRequest;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;

public class CreateProductUseCase {

    private final ProductRepository productRepository;
    private final ProductValidator validator;
    private final ProductMapper productMapper;

    public CreateProductUseCase(ProductRepository productRepository, ProductValidator validator, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.validator = validator;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        validator.validate(productRequest);
        Product product = new Product();
        buildProduct(productRequest, product);
        return productMapper.toProductResponse(productRepository.save(product));
    }


    private void buildProduct(ProductRequest productRequest, Product product) {
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());
    }
}
