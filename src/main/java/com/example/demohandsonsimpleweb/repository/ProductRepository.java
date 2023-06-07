package com.example.demohandsonsimpleweb.repository;

import com.example.demohandsonsimpleweb.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
