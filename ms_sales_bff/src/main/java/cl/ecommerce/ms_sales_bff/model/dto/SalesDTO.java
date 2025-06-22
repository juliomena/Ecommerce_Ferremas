package cl.ecommerce.ms_sales_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class SalesDTO {

    private Long idPedido;    
    private Date fechaPedido;
    private Long total;
    private Long clienteIdCliente;

}
