package com.csi.repo;

import com.csi.mpdel.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<Product,Integer> {


    Product getDataByProdId(int prodId);
}
