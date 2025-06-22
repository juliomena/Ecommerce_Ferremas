package cl.ecommerce.ms_products_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_products_db.model.entities.Products;
import cl.ecommerce.ms_products_db.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsService productService;

    // GET /products
    @GetMapping
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    // POST /products
    @PostMapping
    public Products saveOrUpdateProducts(@RequestBody Products products) {
        return productService.saveOrUpdateProducts(products);
    }

    // GET /products/{id}
    @GetMapping("/{id}")
    public Products getProductsById(@PathVariable("id") Long id) {
        return productService.getProductsById(id);
    }

    // DELETE /products/{id}
    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable("id") Long id) {
        productService.deleteProducts(id);
    }
}