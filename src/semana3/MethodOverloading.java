package semana3;

public class MethodOverloading {

	 public void saludar() {
	        System.out.println("Hola");
	    }

	    public void saludar(String nombre) {
	        System.out.println("Hola " + nombre);
	    }

	    public static void main(String[] args) {

	        MethodOverloading obj = new MethodOverloading();

	        obj.saludar();
	        obj.saludar("Emilyn");
	    }
}
