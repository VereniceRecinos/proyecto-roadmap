package semana1;

public class PassByValue {
	
	public static void modificarNumero(int num) {
		num = 10;
		System.out.println("Dentro del método: " + num);
	}
	

	public static void main(String[] args) {
		

		int numero = 5;
		
		modificarNumero(numero);
		
		System.out.println("Fuera del método: " + numero);
	}

}
