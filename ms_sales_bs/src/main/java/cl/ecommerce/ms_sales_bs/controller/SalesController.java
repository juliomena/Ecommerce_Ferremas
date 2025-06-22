package cl.ecommerce.ms_sales_bs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_sales_bs.model.dto.SalesDTO;
import cl.ecommerce.ms_sales_bs.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @GetMapping
    public List<SalesDTO> selectAllSales() {
        return salesService.selectAllSales();
    }
    
    @PostMapping
    public SalesDTO saveOrUpdateSales(@RequestBody SalesDTO sales) {        
        return salesService.saveOrUpdateSales(sales);
    }

    @DeleteMapping("/{id}")
    public void deleteSales(@PathVariable("id") Long id) {
        salesService.deleteSales(id);
    }

    @GetMapping("/{id}")
    public SalesDTO getSalesById(@PathVariable("id") Long id) {
        return salesService.getSalesById(id);
    }

}
