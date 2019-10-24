
import br.com.senac.guarnier.testesunitario.RemoveImpares;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ahlan Guarnier
 */
public class RemoveImparesTest {
    
    @Test
    public void testaRemoverImparesLista(){
        
        // Simulando lista de dados que será passada por parametro na funcao
        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(2);
        listaOriginal.add(5);
        listaOriginal.add(4);
        listaOriginal.add(7);
        
        // Agora vamos chamar nossa funcao que irá resolver nosso problema
        RemoveImpares removedor = new RemoveImpares();
        List<Integer> listaOriginalAlterada = removedor.removeImparesLista(listaOriginal);
        // OBS: Como ainda não implementamos a funcionalidade ela não irá funcionar
        
        // Simulando lista de dados que será retornada na funcao
        List<Integer> listaRemovidos = new ArrayList<>();
        listaRemovidos.add(2);
        listaRemovidos.add(4);

        // Metodo que compara se as listas sao mesmo iguais
        assertEquals(listaOriginalAlterada, listaRemovidos);
    }
    
}
