package semana3;

public class Estudiante extends Persona {

	@Override
	public void mostrarRol() {
		System.out.println("Soy una estudiante");
	}
		
		public static void main(String[] args) {
			
			Estudiante estudiante = new Estudiante();
			
			estudiante.mostrarRol();
		}
	}
