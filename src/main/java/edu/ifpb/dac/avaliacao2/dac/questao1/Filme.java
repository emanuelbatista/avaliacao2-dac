
package edu.ifpb.dac.avaliacao2.dac.questao1;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
@Entity
public class Filme {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codigo;
    private String titulo;
    private int ano;
    private String genero;
    private String diretor;
    
    @ManyToMany
    private List<Ator> atores;
    
    @ManyToMany
    private List<Evento> eventos;
    
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
