package com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product.ProductMapper;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository.ProductRepository;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.exception.custom.ControllerEntityNotFoundException;
import jakarta.persistence.EntityNotFoundException;

public class GetProductByIdUseCase {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public GetProductByIdUseCase(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    public ProductResponse execute(Long id) {

        return productMapper.toProductResponse(productRepository.findById(id).orElseThrow(()-> new ControllerEntityNotFoundException("Não foi localizado produto com o ID: " + id)));
    }
}
