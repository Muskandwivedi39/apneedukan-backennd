package com.ecommerce.EcommerceApplication.Repository;

import com.ecommerce.EcommerceApplication.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
