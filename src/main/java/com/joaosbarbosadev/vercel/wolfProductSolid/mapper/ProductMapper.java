package com.joaosbarbosadev.vercel.wolfProductSolid.mapper;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.dto.ProductDTO;

public interface ProductMapper {

    Product toProduct(ProductDTO productDTO);
    ProductDTO toProductDTO(Product product);
}
