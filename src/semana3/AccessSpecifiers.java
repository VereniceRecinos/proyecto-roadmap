package semana3;

public class AccessSpecifiers {

	public String nombre = "Emilyn";
    private int edad = 20;

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {

        AccessSpecifiers persona = new AccessSpecifiers();

        persona.mostrarDatos();
    }
}
