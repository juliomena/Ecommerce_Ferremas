package cl.ecommerce.ms_products_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class ProductsDTO {

    private Long idProducto;    
    private String nombre;
    private String descripcion;
    private Long precio;
    private Long stock;
}
