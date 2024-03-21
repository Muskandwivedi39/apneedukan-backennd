package com.ecommerce.EcommerceApplication.service;

import com.ecommerce.EcommerceApplication.model.Category;

import java.util.List;
import java.util.Optional;


public interface CategoryService {

   public void createCategory(Category category);

 List<Category> getAllCategory();
 public Category updateCategory(Category category, Integer categoryId);


    boolean findById(Integer categoryId);



    void deleteCategory(Integer categoryId);

}
