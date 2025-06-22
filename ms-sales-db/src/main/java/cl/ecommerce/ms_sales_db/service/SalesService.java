package cl.ecommerce.ms_sales_db.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_sales_db.model.entities.Sales;
import cl.ecommerce.ms_sales_db.model.repository.SalesRepository;

@Service
public class SalesService {

    @Autowired
    SalesRepository salesRepository;

    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    public Sales saveOrUpdateSales(Sales sales) {
        return salesRepository.save(sales);
    }

    public void deleteSales(Long id) {
        salesRepository.deleteById(id);
    }

    public Sales getSalesById(Long id) {
        return salesRepository.findById(id).orElse(null);
    }

}
