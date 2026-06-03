package semana3;

public class Encapsulation {

	private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        Encapsulation persona = new Encapsulation();

        persona.setNombre("Emilyn");

        System.out.println(persona.getNombre());
    }
}
