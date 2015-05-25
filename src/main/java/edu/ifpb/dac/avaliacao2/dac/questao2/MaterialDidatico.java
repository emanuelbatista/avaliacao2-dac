
package edu.ifpb.dac.avaliacao2.dac.questao2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Lob;
import javax.persistence.Temporal;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
@IdClass(MaterialDidaticoPK.class)
public class MaterialDidatico implements Serializable {
    @Id
    @Column(length = 45)
    private String origem;
    @Id
    private long codigo;
    @Column(length = 155,nullable = false)
    private String titulo;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataCadastro;
    @Lob
    private String descricao;
    @Column(length = 55)
    private String autor;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private TipoMaterialDidatico tipo;
    private boolean publico;
    @Column(precision = 2,scale = 6)
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
