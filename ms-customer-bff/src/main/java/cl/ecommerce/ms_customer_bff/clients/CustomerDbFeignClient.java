package cl.ecommerce.ms_customer_bff.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.ecommerce.ms_customer_bff.model.dto.CustomerDTO;

@FeignClient(name = "ms-customer-bs", url = "http://localhost:8181/")

public interface CustomerDbFeignClient {

    @GetMapping("customers")
    public List<CustomerDTO> selectAllCustomer();
}
