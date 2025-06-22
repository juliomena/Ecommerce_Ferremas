package cl.ecommerce.ms_customer_bff.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_customer_bff.clients.CustomerDbFeignClient;
import cl.ecommerce.ms_customer_bff.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerDbFeignClient customerDbFeignClient;

    public List<CustomerDTO> selectAllCustomer() {
        return customerDbFeignClient.selectAllCustomer();
    }

    public CustomerDTO getCustomerById(Long id) {
        return customerDbFeignClient.getCustomerById(id);
    }

    public CustomerDTO saveOrUpdateCustomer(CustomerDTO customerDTO) {
        return customerDbFeignClient.saveOrUpdateCustomer(customerDTO);
    }

    public void deleteCustomer(Long id) {
        customerDbFeignClient.deleteCustomer(id);
    }
}

/* 
@Service
public class CustomerService {
    private final CustomerDbFeignClient customerDbFeignClient;

    public CustomerService(CustomerDbFeignClient customerDbFeignClient) {
        this.customerDbFeignClient = customerDbFeignClient;
    }

    public List<CustomerDTO> selectAllCustomer() {
        return customerDbFeignClient.selectAllCustomer();
    }

    public CustomerDTO getCustomerById(Long id) {
        return customerDbFeignClient.getCustomerById(id);
    }

    public CustomerDTO saveOrUpdateCustomer(CustomerDTO customerDTO) {
        return customerDbFeignClient.saveOrUpdateCustomer(customerDTO);
    }

    public void deleteCustomer(Long id) {
        customerDbFeignClient.deleteCustomer(id);
    }
}
    */
