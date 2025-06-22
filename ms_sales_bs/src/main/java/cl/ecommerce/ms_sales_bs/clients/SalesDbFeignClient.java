package cl.ecommerce.ms_sales_bs.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_sales_bs.model.dto.SalesDTO;

@FeignClient(name = "ms-sales-db", url = "http://localhost:8280/sales/")
public interface SalesDbFeignClient {

    @GetMapping
    List<SalesDTO> selectAllSales();

    @PostMapping
    SalesDTO saveOrUpdateSales(@RequestBody SalesDTO salesDTO);

    @DeleteMapping("{id}")
    void deleteSales(@PathVariable("id") Long idSales);

    @GetMapping("{id}")
    SalesDTO getSalesById(@PathVariable("id") Long idSales);

}
