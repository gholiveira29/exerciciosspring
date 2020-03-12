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
@Table(name = "tb_cupom_item")


public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_cupom")
    private Long idCupom;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Long idProduto;

    @Column(name = "quantidade_produto")
    private Long  quantidadeProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

}

