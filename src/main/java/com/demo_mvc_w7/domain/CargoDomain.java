package com.demo_mvc_w7.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "CARGOS")
public class CargoDomain extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    @OneToMany(mappedBy = "cargo")
    private List<FuncionarioDomain> funcionarios;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Departamento getDepartamento()
    {
        return departamento;
    }

    public void setDepartamento(Departamento departamento)
    {
        this.departamento = departamento;
    }

    public List<FuncionarioDomain> getFuncionarios()
    {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioDomain> funcionarios)
    {
        this.funcionarios = funcionarios;
    }

}
