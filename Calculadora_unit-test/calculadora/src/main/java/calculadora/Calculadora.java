package calculadora;
public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}
	
	public int subtrair(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b ) {
		return a * b;
	}
	
	public int dividir(int a, int b) {
		return a / b;
	}


	public double raizQuadrada(double a) {
	        if (a < 0) {
	        	System.out.println("Não foi possível calcular a raiz quadrada pois o número selecionado é negativo");
	        }
	        
	        return Math.sqrt(a);
	    }
	}