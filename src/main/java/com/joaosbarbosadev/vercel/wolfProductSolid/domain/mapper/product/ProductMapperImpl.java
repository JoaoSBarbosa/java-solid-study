package com.joaosbarbosadev.vercel.wolfProductSolid.domain.mapper.product;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductRequest;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public Product toProduct(ProductRequest productRequest) {
        if(productRequest == null) return null;

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());
        return product;
    }

    @Override
    public ProductRequest toProductDTO(Product product) {
        if(product == null) return null;
        ProductRequest productRequest = new ProductRequest();
        productRequest.setName(product.getName());
        productRequest.setPrice(product.getPrice());
        return productRequest;
    }

    @Override
    public ProductResponse toProductResponse(Product product) {

        ProductResponse productResponse = new ProductResponse();
        productResponse.setName(product.getName());
        productResponse.setPrice(product.getPrice());
        productResponse.setId(product.getId());
        productResponse.setStock(product.getStock());

        return productResponse;
    }
}
