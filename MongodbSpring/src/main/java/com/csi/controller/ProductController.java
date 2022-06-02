package com.csi.controller;

import com.csi.mpdel.Product;
import com.csi.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/getalldata")
    public List<Product> getAllData(){
        return productServiceImpl.getAllData();
    }
    @GetMapping("/getalldatabyid/{prodId}")
    public Product getAllDataById(@PathVariable int prodId){
        return productServiceImpl.findByProdId(prodId);
    }
    @PostMapping("/savealldata")
    public Product saveAllData(@RequestBody Product product){
        return productServiceImpl.saveAllData(product);
    }
    @PutMapping("/updatedata/{prodId}")
    public Product updateData(@PathVariable int prodId ,@RequestBody Product product){
        Product product1= productServiceImpl.findByProdId(prodId);

        product1.setProdId(product.getProdId());
        product1.setProdName(product.getProdName());
        product1.setProdPrice(product.getProdPrice());
        product1.setProdLunchdate(product.getProdLunchdate());

        return productServiceImpl.updateData(product1);
    }
    @DeleteMapping("/deletedatabyid/{prodId}")
    public void deleteDatabyId(int prodId){
        productServiceImpl.deleteDataById(prodId);
    }
}
