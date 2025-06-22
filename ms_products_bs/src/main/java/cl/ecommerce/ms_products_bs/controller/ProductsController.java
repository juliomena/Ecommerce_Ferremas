package cl.ecommerce.ms_products_bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_products_bs.model.dto.ProductsDTO;
import cl.ecommerce.ms_products_bs.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping
    public List<ProductsDTO> selectAllProducts() {
        return productsService.selectAllProducts();
    }
    
    @PostMapping
    public ProductsDTO saveOrUpdateProducts(@RequestBody ProductsDTO products) {        
        return productsService.saveOrUpdateProducts(products);
    }

    @DeleteMapping("/{id}")
    public void deleteProducts(@PathVariable("id") Long id) {
        productsService.deleteProducts(id);
    }

    @GetMapping("/{id}")
    public ProductsDTO getProductsById(@PathVariable("id") Long id) {
        return productsService.getProductsById(id);
    }

}
