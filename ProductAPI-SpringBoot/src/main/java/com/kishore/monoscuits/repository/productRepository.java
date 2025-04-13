package com.kishore.monoscuits.repository;

import com.kishore.monoscuits.models.Products;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<Products, Long> {

}
