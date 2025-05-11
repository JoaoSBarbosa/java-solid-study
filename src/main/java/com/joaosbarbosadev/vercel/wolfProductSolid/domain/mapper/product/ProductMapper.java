package com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductRequest;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;

public interface ProductMapper {

    Product toProduct(ProductRequest productRequest);
    ProductRequest toProductDTO(Product product);
    ProductResponse toProductResponse(Product product);
}
