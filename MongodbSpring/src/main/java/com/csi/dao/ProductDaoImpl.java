package com.csi.dao;

import com.csi.mpdel.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImpl {

    @Autowired
    ProductRepo productRepoImpl;

    public List<Product> getAllData(){
        return  productRepoImpl.findAll();
    }

    public  Product findByProdId(int prodId){
        return  productRepoImpl.getDataByProdId(prodId);
    }

    public Product saveAllData(Product product){
        return productRepoImpl.save(product);
    }

    public Product updateData(Product product){
        return  productRepoImpl.save(product);
    }

    public void  deleteDataById(int prodId){

        productRepoImpl.deleteById(prodId);
          }
}

