package com.demo_mvc_w7.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "FUNCIONARIOS")
public class FuncionarioDomain extends AbstractEntity<Long> {

    @Column(name="data_entrada",columnDefinition = "DATE", nullable = false)
    private LocalDate dataEntrada;
    
    @Column(name="data_saida", columnDefinition = "DATE")
    private LocalDate dataSaida;
    
    @Column(name="nome", nullable = false)
    private String nome;
    
    @Column(name="salario", columnDefinition = "DECIMAL(7,2) DEFAULT 0.00", nullable = false)
    private BigDecimal salario;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private EnderecoDomain endereco;
    
    @ManyToOne
    @JoinColumn(name = "cargo_id_fk")
    private CargoDomain cargo;

    public LocalDate getDataEntrada()
    {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada)
    {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida()
    {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida)
    {
        this.dataSaida = dataSaida;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public BigDecimal getSalario()
    {
        return salario;
    }

    public void setSalario(BigDecimal salario)
    {
        this.salario = salario;
    }

    public EnderecoDomain getEndereco()
    {
        return endereco;
    }

    public void setEndereco(EnderecoDomain endereco)
    {
        this.endereco = endereco;
    }

    public CargoDomain getCargo()
    {
        return cargo;
    }

    public void setCargo(CargoDomain cargo)
    {
        this.cargo = cargo;
    }
    
    

}
