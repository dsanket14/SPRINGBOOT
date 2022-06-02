package com.csi.service;

import com.csi.dao.ProductDaoImpl;
import com.csi.mpdel.Product;
import com.csi.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDaoImpl productDaoImpl;

    public List<Product> getAllData(){
        return  productDaoImpl.getAllData();
    }

    public  Product findByProdId(int prodId){
        return  productDaoImpl.findByProdId(prodId);
    }

    public Product saveAllData(Product product){
        return productDaoImpl.saveAllData(product);
    }

    public Product updateData(Product product){
        return  productDaoImpl.updateData(product);
    }

    public void  deleteDataById(int prodId){

        productDaoImpl.deleteDataById(prodId);
    }
}
