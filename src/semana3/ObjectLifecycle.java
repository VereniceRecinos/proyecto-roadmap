package semana3;

public class ObjectLifecycle {

	String nombre;

    public ObjectLifecycle() {
        System.out.println("Objeto creado");
    }

    public static void main(String[] args) {

        ObjectLifecycle obj = new ObjectLifecycle();

        obj.nombre = "Emilyn";

        System.out.println("Nombre: " + obj.nombre);
    }
}
