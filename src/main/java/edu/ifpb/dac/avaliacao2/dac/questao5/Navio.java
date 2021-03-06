/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.avaliacao2.dac.questao5;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Pris
 */
@Entity
public class Navio implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codNavio;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Transporte transporte;
    private String nome;
    private float capacidade;
    private String pais;

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public long getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(long codNavio) {
        this.codNavio = codNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public String getPaisFabricacao() {
        return pais;
    }

    public void setPaisFabricacao(String paisFabricacao) {
        this.pais = paisFabricacao;
    }

    
    
    
}
