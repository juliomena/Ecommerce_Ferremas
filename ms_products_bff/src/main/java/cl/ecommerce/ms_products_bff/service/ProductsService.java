package cl.ecommerce.ms_products_bff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_products_bff.clients.ProductsDbFeignClient;
import cl.ecommerce.ms_products_bff.model.dto.ProductsDTO;

@Service
public class ProductsService {

     @Autowired
    ProductsDbFeignClient productsDbFeignClient;

    public List<ProductsDTO> selectAllProducts() {
        return productsDbFeignClient.selectAllProducts();
    }

    public ProductsDTO saveOrUpdateProducts(ProductsDTO productsDTO) {
        return productsDbFeignClient.saveOrUpdateProducts(productsDTO);
    }

    public void deleteProducts(Long id) {
        productsDbFeignClient.deleteProducts(id);
    }

    public ProductsDTO getProductsById(Long id) {
        return productsDbFeignClient.getProductsById(id);
    }

}
