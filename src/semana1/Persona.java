package semana1;

public class Persona {

	String nombre;
	int edad;
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad : " + edad);
	}
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.nombre = "Emilyn";
		persona1.edad = 22;
		
		persona1.mostrarDatos();

	}

}
