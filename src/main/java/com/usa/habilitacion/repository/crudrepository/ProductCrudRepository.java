/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usa.habilitacion.repository.crudrepository;

import com.usa.habilitacion.model.Product;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Sebastian
 */
public interface ProductCrudRepository extends MongoRepository<Product,String> {
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
    public List<Product> findByPriceLessThanEqual(Double price);
}
