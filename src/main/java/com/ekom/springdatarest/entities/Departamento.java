package com.ekom.springdatarest.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departamento_id")
    private Long departamentoId;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Empregado> empregados;

    public Departamento() {
    }

    public Departamento(Long departamentoId, String nome, List<Empregado> empregados) {
        this.departamentoId = departamentoId;
        this.nome = nome;
        this.empregados = empregados;
    }

    public Long getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Long departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Empregado> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Empregado> empregados) {
        this.empregados = empregados;
    }
}
