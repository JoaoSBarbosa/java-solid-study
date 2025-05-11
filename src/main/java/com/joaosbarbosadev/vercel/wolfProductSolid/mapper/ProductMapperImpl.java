package com.joaosbarbosadev.vercel.wolfProductSolid.mapper;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public Product toProduct(ProductDTO productDTO) {
        if(productDTO == null) return null;
        return Product
                .builder()
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .stock(productDTO.getStock())
                .build();
    }

    @Override
    public ProductDTO toProductDTO(Product product) {
        if(product == null) return null;

        return ProductDTO
                .builder()
                .name(product.getName())
                .price(product.getPrice())
                .stock(product.getStock())
                .build();
    }
}
