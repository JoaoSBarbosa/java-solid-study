package com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.controller;

import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.CreateProductUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.GetProductByIdUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.application.usecase.product.ListProductsUseCase;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductRequest;
import com.joaosbarbosadev.vercel.wolfProductSolid.interfaces.dto.product.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final CreateProductUseCase create;
    private final ListProductsUseCase list;
    private final GetProductByIdUseCase getById;

    public ProductController(CreateProductUseCase create, ListProductsUseCase list, GetProductByIdUseCase getById) {
        this.create = create;
        this.list = list;
        this.getById = getById;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        ProductResponse response = create.create(productRequest);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> responses = list.execute();
        return ResponseEntity.ok(responses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable long id) {
        ProductResponse response = getById.execute(id);
        return ResponseEntity.ok(response);
    }
}
