package semana1;

public class InitializerBlock {
	
	{
		System.out.println("Bloque inicializador ejecutado");
	}
	
	public InitializerBlock() {
		System.out.println("Constructor ejecutado");
	}

	public static void main(String[] args) {
		
		InitializerBlock obj1 = new InitializerBlock();
		InitializerBlock obj2 = new InitializerBlock();
	}

}
