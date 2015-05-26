
package edu.ifpb.dac.avaliacao2.dac.questao3;

import edu.ifpb.dac.avaliacao2.dac.questao2.MaterialDidatico;
import edu.ifpb.dac.avaliacao2.dac.questao2.MaterialDidaticoPK;
import java.util.Date;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class Main {
    public static void main(String[] args) {
        DAO<MaterialDidatico> dao=new DAOJPA<>();
        MaterialDidaticoPK materialDidaticoPK=new MaterialDidaticoPK();
        materialDidaticoPK.setCodigo(2);
        materialDidaticoPK.setOrigem("IFPB");
        MaterialDidatico materialDidatico=new MaterialDidatico();

         //Salvar
        materialDidatico.setCodigo(materialDidaticoPK.getCodigo());
        materialDidatico.setOrigem(materialDidaticoPK.getOrigem());
        materialDidatico.setTitulo("teste");
        materialDidatico.setDataCadastro(new Date());
        materialDidatico.setTamanho(123456.235);
        dao.salvar(materialDidatico);
        //
       //Atualizar
        materialDidatico=dao.buscar(materialDidaticoPK, MaterialDidatico.class);
        materialDidatico.setAutor("Emanuel");
        materialDidatico.setDescricao("ola");
        dao.atualizar(materialDidatico);
        //Remover
        materialDidatico=dao.buscar(materialDidaticoPK, MaterialDidatico.class);
        dao.excluir(materialDidatico);
        
        
    }
}
