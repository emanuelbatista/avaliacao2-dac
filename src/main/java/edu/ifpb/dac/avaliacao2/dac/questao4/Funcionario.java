/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.avaliacao2.dac.questao4;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pris
 */
@Entity
public class Funcionario implements Serializable {
    
    public enum Tipo{
        EMPREGADO, GERENTE
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codigo;
    
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    
    @Enumerated(EnumType.STRING)
    private Tipo cargo = Tipo.EMPREGADO;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Tipo getCargo() {
        return cargo;
    }

    public void setCargo(Tipo cargo) {
        this.cargo = cargo;
    }
    
    
}
