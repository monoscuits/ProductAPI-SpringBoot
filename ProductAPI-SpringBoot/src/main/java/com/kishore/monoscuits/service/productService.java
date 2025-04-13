package com.kishore.monoscuits.service;

import java.util.*;
import com.kishore.monoscuits.models.Products;
import com.kishore.monoscuits.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {

    @Autowired
    private productRepository productRepository;

    public List<Products> getAllProducts(){
        return productRepository.findAll();
    }

    public Products createProduct(Products product){
        return productRepository.save(product);
    }

    public Products updateProduct(long id, Products updatedProduct){

        Products existingProduct = productRepository.findById(id).orElse(null);

        if(existingProduct == null){
            return null;
        }
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setCategory(updatedProduct.getCategory());
        existingProduct.setNumberOfRatings(updatedProduct.getNumberOfRatings());
        existingProduct.setRatings(updatedProduct.getRatings());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setStock(updatedProduct.getStock());
        existingProduct.setImage(updatedProduct.getImage());

        return productRepository.save(existingProduct);
    }

    public boolean deleteProduct(long id){
        Optional<Products> existingProduct = productRepository.findById(id);
        if(existingProduct.isPresent()){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Products getProduct(long id){
        Optional<Products> existingProduct = productRepository.findById(id);
        if(existingProduct.isPresent()){
            return existingProduct.get();
        }
        return null;
    }
}
