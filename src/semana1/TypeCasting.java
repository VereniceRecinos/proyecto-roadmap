package semana1;

public class TypeCasting {

	public static void main(String[] args) {
		
		 // Casting implícito
        int numeroEntero = 10;
        double numeroDecimal = numeroEntero;
        System.out.println("Entero a decimal: " + numeroDecimal);

        // Casting explícito
        double otroDecimal = 9.8;
        int otroEntero = (int) otroDecimal;
        System.out.println("Decimal a entero: " + otroEntero);

	}

}
