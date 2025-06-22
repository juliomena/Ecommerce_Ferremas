package cl.ecommerce.ms_products_db.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.ecommerce.ms_products_db.model.entities.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> { 
}

