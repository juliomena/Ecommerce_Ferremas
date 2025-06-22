package cl.ecommerce.ms_products_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_products_bff.model.dto.ProductsDTO;

@FeignClient(name = "ms-products-bs", url = "http://localhost:8181/products/")
public interface ProductsDbFeignClient {

    @GetMapping
    List<ProductsDTO> selectAllProducts();

    @PostMapping
    ProductsDTO saveOrUpdateProducts(@RequestBody ProductsDTO productsDTO);

    @DeleteMapping("{id}")
    void deleteProducts(@PathVariable("id") Long idProducto);

    @GetMapping("{id}")
    ProductsDTO getProductsById(@PathVariable("id") Long idProducto);

}
