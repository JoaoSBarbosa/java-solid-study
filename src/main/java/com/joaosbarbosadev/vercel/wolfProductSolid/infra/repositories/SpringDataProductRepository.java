package com.joaosbarbosadev.vercel.wolfProductSolid.infra.repositories;

import com.joaosbarbosadev.vercel.wolfProductSolid.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataProductRepository extends JpaRepository<Product, Long> {
}
