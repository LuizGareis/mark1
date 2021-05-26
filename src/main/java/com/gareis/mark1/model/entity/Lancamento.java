package com.gareis.mark1.model.entity;

import com.gareis.mark1.model.entity.enums.StatusLancamento;
import com.gareis.mark1.model.entity.enums.TipoLancamento;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "LANCAMENTO", schema = "FINANCAS")
@Data
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MES")
    private Integer mes;

    @Column(name = "ANO")
    private Integer ano;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @Column(name = "TIPO")
    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private StatusLancamento status;

}
