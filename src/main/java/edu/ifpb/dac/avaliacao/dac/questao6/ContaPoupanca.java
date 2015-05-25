/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.dac.avaliacao.dac.questao6;

import javax.persistence.Entity;

/**
 *
 * @author Pris
 */
@Entity
public class ContaPoupanca extends Conta{
    
    public double credito(double valor){
        
        return valor;
    }
}
