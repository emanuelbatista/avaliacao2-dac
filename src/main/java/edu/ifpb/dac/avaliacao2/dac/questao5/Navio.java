/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.avaliacao2.dac.questao5;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Pris
 */
@Entity
public class Navio implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codNavio;
    
    private String nome;
    private float carga;
    private String paisFabricacao;
    
    @ManyToOne
    private Comandante comandante;

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

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public String getPaisFabricacao() {
        return paisFabricacao;
    }

    public void setPaisFabricacao(String paisFabricacao) {
        this.paisFabricacao = paisFabricacao;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }
    
    
    
}
