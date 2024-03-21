package com.ecommerce.EcommerceApplication.service.Impl;

import com.ecommerce.EcommerceApplication.Repository.ProductRepo;
import com.ecommerce.EcommerceApplication.dto.ProductDto;
import com.ecommerce.EcommerceApplication.model.Category;
import com.ecommerce.EcommerceApplication.model.Product;
import com.ecommerce.EcommerceApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;


    @Override
    public void createProduct(ProductDto productDto, Category category) {
        Product product=new Product();
        product.setDescription(productDto.getDescription());
        product.setName(productDto.getName());
        product.setImageUrl(productDto.getImageUrl());
        product.setPrice(productDto.getPrice());
        product.setCategory(category);
        productRepo.save(product);
    }
}
