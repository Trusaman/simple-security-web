package com.example.demohandsonsimpleweb;

import com.example.demohandsonsimpleweb.model.Product;
import com.example.demohandsonsimpleweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {

        return productRepository.findAll();
    }
}
