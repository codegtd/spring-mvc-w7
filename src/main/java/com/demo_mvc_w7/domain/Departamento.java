package com.demo_mvc_w7.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
    
    @Column(name = "nome", nullable = false, unique = true, length = 60)
    private String nome;
    
    @OneToMany(mappedBy = "departamento")
    private List<CargoDomain> cargos;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public List<CargoDomain> getCargos()
    {
        return cargos;
    }

    public void setCargos(List<CargoDomain> cargos)
    {
        this.cargos = cargos;
    }
}
