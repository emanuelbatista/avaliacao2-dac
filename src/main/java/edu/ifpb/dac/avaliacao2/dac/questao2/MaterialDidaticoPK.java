
package edu.ifpb.dac.avaliacao2.dac.questao2;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */

public class MaterialDidaticoPK implements Serializable {
    private long codigo;
    private String origem;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 97 * hash + Objects.hashCode(this.origem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialDidaticoPK other = (MaterialDidaticoPK) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.origem, other.origem)) {
            return false;
        }
        return true;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    


    
    
    

}
