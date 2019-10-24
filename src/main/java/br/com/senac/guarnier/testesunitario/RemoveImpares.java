package br.com.senac.guarnier.testesunitario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahlan Guarnier
 */
public class RemoveImpares {
    
    public List<Integer> removeImparesLista(List<Integer> lista){
        
        List<Integer> listaDeRetorno = new ArrayList<>();
        listaDeRetorno.addAll(lista);
         
        for(Integer itemLista : lista){
            if(itemLista % 2 != 0){
                listaDeRetorno.remove(itemLista);
            }
        }  
        
        return listaDeRetorno;
    }
    
}
