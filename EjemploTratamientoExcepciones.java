public class EjemploTratamientoExcepciones {

public static void main(String[] args) {
		int a = 2, b = 0;
		
		try {
			System.out.println(a/b);
		} catch(Exception ex) {
			//ex.printStackTrace();
			System.out.println("Error de division entre cero");
		}
		
		System.out.println("La aplicacion continua");

	}

}
