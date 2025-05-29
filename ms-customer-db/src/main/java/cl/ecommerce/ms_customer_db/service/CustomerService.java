package cl.ecommerce.ms_customer_db.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.ecommerce.ms_customer_db.model.entities.Customer;
import cl.ecommerce.ms_customer_db.model.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> selectAllCustomer(){
        List<Customer> listaCustomers = customerRepository.findAll();
        return listaCustomers;
    }
}
