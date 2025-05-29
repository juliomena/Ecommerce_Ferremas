package cl.ecommerce.ms_customer_db.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import cl.ecommerce.ms_customer_db.model.entities.Customer;
import cl.ecommerce.ms_customer_db.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }
    
}
