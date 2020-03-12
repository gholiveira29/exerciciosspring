package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")

public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom")
    private Long id;

    @Column(name = "in_cliente")
    private Long idCliente;

    @Column(name = "td_venda")
    private String dataVenda;

    @Column(name = "vl_venda")
    private BigDecimal valorVenda;
}
