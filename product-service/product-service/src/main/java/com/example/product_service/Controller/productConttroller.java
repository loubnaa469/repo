package com.example.product_service.Controller;
import com.example.product_service.dto.ProductResponce;
import com.example.product_service.dto.ProductRequest;
import com.example.product_service.service.productService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class productConttroller {


    private  productService ProductService;

    @Autowired
    public productConttroller(productService ProductService) {
        this.ProductService = ProductService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponce createProduct(@RequestBody ProductRequest productRequest ){
        return ProductService.createProduct(productRequest);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponce> getAllProducts(){
        return ProductService.getAllProducts();
    }

}
