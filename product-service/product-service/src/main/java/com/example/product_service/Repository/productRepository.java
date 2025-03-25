package com.example.product_service.Repository;

import com.example.product_service.Model.product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface productRepository extends MongoRepository<product,String> {
}
