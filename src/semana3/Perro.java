package semana3;

public class Perro extends Animal {

	public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    public static void main(String[] args) {

        Perro perro = new Perro();

        perro.comer();   // Método heredado de Animal
        perro.ladrar();  // Método propio de Perro
    }
}
