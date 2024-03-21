package com.ecommerce.EcommerceApplication.Repository;

import com.ecommerce.EcommerceApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
