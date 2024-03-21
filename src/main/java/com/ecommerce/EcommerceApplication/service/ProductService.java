package com.ecommerce.EcommerceApplication.service;

import com.ecommerce.EcommerceApplication.dto.ProductDto;
import com.ecommerce.EcommerceApplication.model.Category;

public interface ProductService {
    public void createProduct(ProductDto productDto, Category category);

}
