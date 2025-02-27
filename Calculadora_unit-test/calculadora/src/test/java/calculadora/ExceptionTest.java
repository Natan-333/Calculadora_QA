package calculadora;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ExceptionTest {

	//Erro esperado
	@Test
	public void testExeptionMessage() {
		try {
			//pegamos primeiro objeto que não existe retornando exceção
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Exception foi gerada.");
		}
	}
	
}
