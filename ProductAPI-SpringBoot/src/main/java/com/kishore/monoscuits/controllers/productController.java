package com.kishore.monoscuits.controllers;
import com.kishore.monoscuits.models.Products;
import com.kishore.monoscuits.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("products")
public class productController {

    @Autowired
    private productService productService;

    @GetMapping("/readAll")
    public List<Products> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/create")
    public Products createProduct(@RequestBody Products product){
        return productService.createProduct(product);
    }

    @PutMapping("/update/{id}")
    public Products updateProduct(@PathVariable long id, @RequestBody Products product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable long id){
        boolean isDeleted = productService.deleteProduct(id);
        if(isDeleted){
            return "Product is deleted successfully!";
        }

        return "Product is not found!";
    }

    @GetMapping("/read/{id}")
    public Products getProduct(@PathVariable long id){
        return productService.getProduct(id);
    }
}
