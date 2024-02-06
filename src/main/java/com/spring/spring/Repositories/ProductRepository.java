
package com.spring.spring.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.spring.model.ProductModel;

@Repository
/**
 * ProductRepository
 */
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{

    
}