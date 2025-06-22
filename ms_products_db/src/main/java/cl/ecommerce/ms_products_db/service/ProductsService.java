package cl.ecommerce.ms_products_db.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_products_db.model.entities.Products;
import cl.ecommerce.ms_products_db.model.repository.ProductsRepository;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products saveOrUpdateProducts(Products products) {
        return productsRepository.save(products);
    }

    public void deleteProducts(Long id) {
        productsRepository.deleteById(id);
    }

    public Products getProductsById(Long id) {
        return productsRepository.findById(id).orElse(null);
    }
}

