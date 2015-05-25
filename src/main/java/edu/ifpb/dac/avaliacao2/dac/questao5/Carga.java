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

/**
 *
 * @author Pris
 */
@Entity
public class Carga implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codCarga;
    
    private String origem;
    private String destino;

    public long getCodCarga() {
        return codCarga;
    }

    public void setCodCarga(long codCarga) {
        this.codCarga = codCarga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    
}
