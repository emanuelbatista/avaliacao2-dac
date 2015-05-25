/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.avaliacao.dac.questao6;

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
public class Conta implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codigo;
    
    private String numero;
    private String agencia;
    private String digitoAg;
    private String digitoCt;
    private Double saldo;
    private String senha;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigitoAg() {
        return digitoAg;
    }

    public void setDigitoAg(String digitoAg) {
        this.digitoAg = digitoAg;
    }

    public String getDigitoCt() {
        return digitoCt;
    }

    public void setDigitoCt(String digitoCt) {
        this.digitoCt = digitoCt;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
