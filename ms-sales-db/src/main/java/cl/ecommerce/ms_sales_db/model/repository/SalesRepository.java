package cl.ecommerce.ms_sales_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.ecommerce.ms_sales_db.model.entities.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>{

}
