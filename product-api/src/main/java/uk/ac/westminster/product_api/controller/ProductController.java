/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.westminster.product_api.controller;

import DTOs.Product.Product;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thidass
 */
@RestController 
public class ProductController {
    
    @GetMapping("/products") 
    public Product getAllProducts(){
        return null; 
    } 
    
    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product)
    {
        try{
           System.out.println(product);
            return product; 
        }catch (Exception ex){ 
            ex.printStackTrace();
            return null;
        }
    }
    
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable long id){
        return null;
    }
    
    @DeleteMapping("/products/{id}")
    public Product deleteProductById(@PathVariable long id){
        return null;
    }
    
}
