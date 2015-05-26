package edu.ifpb.dac.avaliacao2.dac.questao5;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Pris
 */
@Entity
public class Carga implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codCarga;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;
    private String origem;
    private String destino;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

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
