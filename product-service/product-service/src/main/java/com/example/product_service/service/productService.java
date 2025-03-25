package com.example.product_service.service;

import com.example.product_service.Model.product;
import com.example.product_service.Repository.productRepository;
import com.example.product_service.dto.ProductResponce;
import com.example.product_service.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class productService {
    private  final productRepository ProductRepository;



    public ProductResponce createProduct(ProductRequest productRequest) {
        product Product = product.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
        ProductRepository.save(Product);
        log.info("produCt created succefully");
        return new ProductResponce(Product.getId(),Product.getName(),Product.getDescription(),Product.getPrice());
    }

    public List<ProductResponce> getAllProducts() {
        return ProductRepository.findAll()
                .stream()
                .map(Product -> new ProductResponce(Product.getId(),Product.getName()
                        ,Product.getDescription(),Product.getPrice()))
                .toList();
    }
}
