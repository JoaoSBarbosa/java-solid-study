package com.joaosbarbosadev.vercel.wolfProductSolid.domain.validator;

import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductRequest;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator {

    public void validate(ProductRequest product) {
        if(product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto é obrigatorio");
        }
        if(product.getPrice() <= 0){
            throw new IllegalArgumentException("O valor do produto é obrigatorio");
        }
        if(product.getStock() == null || product.getStock() < 0){
            throw new IllegalArgumentException("O estqoue do produto é obrigatorio");
        }
    }
}
