package com.ecommerce.EcommerceApplication.service.Impl;

import com.ecommerce.EcommerceApplication.Repository.CategoryRepo;
import com.ecommerce.EcommerceApplication.model.Category;
import com.ecommerce.EcommerceApplication.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepo.save(category);

    }

    @Override
    public Category updateCategory(Category category, Integer categoryId) {
         Category cat = categoryRepo.findById(categoryId).get();
        cat.setCategoryName(category.getCategoryName());
        cat.setDescription(category.getDescription());
        cat.setImageUrl(category.getImageUrl());
       return categoryRepo.save(cat);
    }

    @Override
    public boolean findById(Integer categoryId) {
        return categoryRepo.findById(categoryId).isPresent();
    }

    @Override
    public void deleteCategory(Integer categoryId) {
Category category1=categoryRepo.findById(categoryId).get();
categoryRepo.delete(category1);

    }



}