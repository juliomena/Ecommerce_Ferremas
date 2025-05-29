package cl.ecommerce.ms_customer_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.ecommerce.ms_customer_db.model.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
