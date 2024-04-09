package calculadora;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
			
	@Test
	public void testSomar() {
		
		Calculadora calc = new Calculadora();
		
		int valor1 = 2;
		int valor2 = 3;
		int resultado = calc.somar(valor1,valor2);
		assertEquals(valor1 + valor2, resultado);
	}

	@Test
	 public void testRaizQuadrada() {
		 Calculadora calc = new Calculadora();
		
		 double valor = 25;
	     double resultado = calc.raizQuadrada(valor);
	     assertEquals(5.0, resultado);
	 }
}
