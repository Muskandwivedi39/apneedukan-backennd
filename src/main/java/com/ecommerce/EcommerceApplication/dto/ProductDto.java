package com.ecommerce.EcommerceApplication.dto;

import jakarta.validation.constraints.NotNull;

public class ProductDto {
    private Integer id;

    @NotNull
    private String name;
    @NotNull
    private double price;

    @NotNull
    private String imageUrl;
    @NotNull
    private String description;
    private Integer categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
