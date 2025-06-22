package cl.ecommerce.ms_sales_db.model.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Pedido")
@Getter
@Setter
@ToString

public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_pedido")
    private Long idPedido; // Usar Integer o Long

    @Column(name = "Fecha_pedido")
    private Date fechaPedido;

    @Column(name = "Total")
    private Long total;

    @Column(name = "Cliente_id_cliente")
    private Long clienteIdCliente;
}
