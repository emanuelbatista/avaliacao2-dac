
package edu.ifpb.dac.avaliacao2.dac.questao3;

import edu.ifpb.dac.avaliacao2.dac.questao2.MaterialDidatico;
import edu.ifpb.dac.avaliacao2.dac.questao2.MaterialDidaticoPK;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class Main {
    public static void main(String[] args) {
        MaterialDidaticoPK materialDidaticoPK=new MaterialDidaticoPK();
        materialDidaticoPK.setCodigo(1);
        materialDidaticoPK.setOrigem("IFPB");
        MaterialDidatico materialDidatico=new MaterialDidatico();
    }
}
