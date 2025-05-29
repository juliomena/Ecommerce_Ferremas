package cl.ecommerce.ms_customer_bs.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cl.ecommerce.ms_customer_bs.model.dto.CustomerDTO;

@FeignClient(name = "ms-customer-db", url = "http://localhost:8080/")
public interface CustomerDbFeignClient {

    @GetMapping("customers")
    public List<CustomerDTO> selectAllCustomer();

}
