package com.ecommerce.EcommerceApplication.controller;

import com.ecommerce.EcommerceApplication.Repository.CategoryRepo;
import com.ecommerce.EcommerceApplication.common.ApiResponse;
import com.ecommerce.EcommerceApplication.dto.ProductDto;
import com.ecommerce.EcommerceApplication.model.Category;
import com.ecommerce.EcommerceApplication.model.Product;
import com.ecommerce.EcommerceApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryRepo categoryRepo;
    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createProduct(@RequestBody ProductDto productDto){
        Optional<Category> optionalCategory=categoryRepo.findById(productDto.getCategoryId());
        if(!optionalCategory.isPresent()){
            return new ResponseEntity<ApiResponse>(new ApiResponse(false,"category dost not exists"), HttpStatus.BAD_REQUEST);

        }
        productService.createProduct(productDto,optionalCategory.get());
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"product added successfully"),HttpStatus.CREATED);

    }


}
