
package edu.ifpb.dac.avaliacao2.dac.questao5;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
public class Transporte implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    
    @Temporal(TemporalType.DATE)
    private Date dataTransporte;
    private double valor;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Carga carga;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataTransporte() {
        return dataTransporte;
    }

    public void setDataTransporte(Date dataTransporte) {
        this.dataTransporte = dataTransporte;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
    
    
}
