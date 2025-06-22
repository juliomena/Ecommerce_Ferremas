package cl.ecommerce.ms_customer_bs.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import cl.ecommerce.ms_customer_bs.model.dto.CustomerDTO;

@FeignClient(name = "ms-customer-db", url = "http://localhost:8080/")
public interface CustomerDbFeignClient {

    @GetMapping("customers")
    List<CustomerDTO> selectAllCustomer();

    @PostMapping("customers")
    CustomerDTO saveOrUpdateCustomer(@RequestBody CustomerDTO customerDTO);

    @DeleteMapping("customers/{id}")
    void deleteCustomer(@PathVariable("id") Long id);

    @GetMapping("customers/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") Long id);
}