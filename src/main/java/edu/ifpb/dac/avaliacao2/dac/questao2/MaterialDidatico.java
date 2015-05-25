
package edu.ifpb.dac.avaliacao2.dac.questao2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Temporal;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
@IdClass(MaterialDidaticoPK.class)
public class MaterialDidatico implements Serializable {
    @Id
    private String origem;
    @Id
    private long codigo;
    private String titulo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    private String descricao;
    private String autor;
    @Enumerated(EnumType.STRING)
    private TipoMaterialDidatico tipo;
    private boolean publico;
    private double tamanho;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TipoMaterialDidatico getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterialDidatico tipo) {
        this.tipo = tipo;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    

}
