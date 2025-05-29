package cl.ecommerce.ms_customer_bs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_customer_bs.clients.CustomerDbFeignClient;
import cl.ecommerce.ms_customer_bs.model.dto.CustomerDTO;

@Service

public class CustomerService {

    @Autowired
    CustomerDbFeignClient customerDbFeignClient;

    public  List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = customerDbFeignClient.selectAllCustomer();
        return listaClientes;
    }    
}
