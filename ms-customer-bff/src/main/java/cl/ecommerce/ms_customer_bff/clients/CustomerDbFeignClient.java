package cl.ecommerce.ms_customer_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_customer_bff.model.dto.CustomerDTO;

@FeignClient(name = "ms-customer-bs", url = "http://localhost:8081/")
public interface CustomerDbFeignClient {

    @GetMapping("customers")
    List<CustomerDTO> selectAllCustomer();

    @GetMapping("customers/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") Long id);

    @PostMapping("customers")
    CustomerDTO saveOrUpdateCustomer(@RequestBody CustomerDTO customerDTO);

    @DeleteMapping("customers/{id}")
    void deleteCustomer(@PathVariable("id") Long id);
}