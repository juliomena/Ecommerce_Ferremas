package cl.ecommerce.ms_sales_db.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_sales_db.model.entities.Sales;
import cl.ecommerce.ms_sales_db.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @GetMapping
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }
    
    @PostMapping
    public Sales saveOrUpdateSales(@RequestBody Sales sales) {        
        return salesService.saveOrUpdateSales(sales);
    }

    @DeleteMapping("/{id}")
    public void deleteSales(@PathVariable("id") Long id) {
        salesService.deleteSales(id);
    }

    @GetMapping("/{id}")
    public Sales getSalesById(@PathVariable("id") Long id) {
        return salesService.getSalesById(id);
    }

}
