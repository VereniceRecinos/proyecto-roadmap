package semana1;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
            int resultado = 10 / 0; // error
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero");
        }

        System.out.println("El programa continúa...");

	}

}
