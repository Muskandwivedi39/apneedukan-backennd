package com.ecommerce.EcommerceApplication.controller;

import com.ecommerce.EcommerceApplication.common.ApiResponse;
import com.ecommerce.EcommerceApplication.model.Category;
import com.ecommerce.EcommerceApplication.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@Tag(name = "CategoryController",description = "To perform category operation on E-COMMERCE application")
public class CategoryController {
@Autowired
    CategoryService categoryService;

@Operation(
        summary = "Post operation on category",
        description = "Post operation used to create category on E-commerce Application "


)
    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createCategory(@RequestBody Category category){
         categoryService.createCategory(category);
         return new ResponseEntity<>(new ApiResponse(true,"created a new category"), HttpStatus.CREATED);
    }
    @Operation(
            summary = "Get operation on category",
            description = "Get operation used to retrieve on E-commerce Application "


    )
    @GetMapping("/list")
    public List<Category> getAllCategory(){
     return categoryService.getAllCategory();
    }
    @Operation(
            summary = "Update operation on category",
            description = "Update operation used to update category on E-commerce Application "


    )
    @PutMapping("/update/{categoryId}")
    public ResponseEntity<ApiResponse> updateCategory(@RequestBody Category  category, @PathVariable Integer categoryId){
        if(!categoryService.findById(categoryId)) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false,"category does not exist"),HttpStatus.NOT_FOUND);
        }
        categoryService.updateCategory(category, categoryId);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true,"category has been updated"),HttpStatus.OK);
    }
    @Operation(
            summary = "Delete operation on category",
            description = "Delete operation used to delete category on E-commerce Application "


    )
    @DeleteMapping("/{categoryId}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer categoryId){
        categoryService.deleteCategory(categoryId);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "category deletedsuccesfully"),HttpStatus.OK);
    }

}
