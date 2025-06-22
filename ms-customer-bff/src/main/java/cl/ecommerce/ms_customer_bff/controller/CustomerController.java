package cl.ecommerce.ms_customer_bff.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_customer_bff.model.dto.CustomerDTO;
import cl.ecommerce.ms_customer_bff.service.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<CustomerDTO> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable("id") Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public CustomerDTO saveOrUpdateCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.saveOrUpdateCustomer(customerDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
    }
}