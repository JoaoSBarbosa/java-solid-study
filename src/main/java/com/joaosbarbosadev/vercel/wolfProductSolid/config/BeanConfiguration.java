package com.joaosbarbosadev.vercel.wolfProductSolid.config;

import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.CreateProductUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.GetProductByIdUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.ListProductsUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product.ProductMapper;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.repository.ProductRepository;
import com.joaosbarbosadev.vercel.wolfProductSolid.domain.validator.ProductValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateProductUseCase createProductUseCase(ProductRepository repo, ProductValidator validator, ProductMapper productMapper) {
        return new CreateProductUseCase(repo, validator, productMapper);
    }

    @Bean
    public ListProductsUseCase listProductsUseCase(ProductRepository repo, ProductMapper mapper) {
        return new ListProductsUseCase(repo, mapper);
    }

    @Bean
    public GetProductByIdUseCase getProductByIdUseCase(ProductRepository repo, ProductMapper mapper) {
        return new GetProductByIdUseCase(repo, mapper);
    }
}
