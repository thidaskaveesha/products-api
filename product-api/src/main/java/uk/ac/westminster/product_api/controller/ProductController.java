/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.controller;

import dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thidass
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    
//    @GetMapping("/{id}")
//    public Product getById(@PathVariable long id){
//        return new Product(id, "Laptop", 999.99);
//    }
    
    @PostMapping("/add-product")
    public Product insertProduct(@RequestBody Product product) {
        return product;
    }
}
