package cl.ecommerce.ms_customer_bff.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import cl.ecommerce.ms_customer_bff.model.dto.CustomerDTO;
import cl.ecommerce.ms_customer_bff.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("*")

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDTO> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }
}
