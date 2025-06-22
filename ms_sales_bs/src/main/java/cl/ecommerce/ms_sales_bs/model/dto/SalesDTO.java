package cl.ecommerce.ms_sales_bs.model.dto;

import java.sql.Date;
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

public class SalesDTO {

    private Long idPedido;    
    private Date fechaPedido;
    private Long total;
    private Long clienteIdCliente;

}
