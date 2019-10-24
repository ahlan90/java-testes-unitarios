
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
        
        // Nesse momento o nosso teste começa a falhar, então devemos
        // implementar a solução, por via das duvidas vc pode comentar
        // as linhas que adiciona o numero 5 e 7 para ver que ela vai
        // funcionar
        
        // Simulando lista de dados que será retornada na funcao
        List<Integer> listaRemovidos = new ArrayList<>();
        listaRemovidos.add(2);
        listaRemovidos.add(4);

        // Metodo que compara se as listas sao mesmo iguais
        assertEquals(listaOriginal, listaRemovidos);
    }
    
}
