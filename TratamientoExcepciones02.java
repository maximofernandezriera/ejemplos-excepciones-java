public class TratamientoExcepciones02 {

	public static void main(String[] args) {
		try {
			int a = 2;
			int b = 0;
			System.out.println(a/b); //Error de division entre 0			
		} catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.err.println("Error: " + ex.getMessage());
		} finally {
			System.out.println("\nEstas instrucciones son muy importantes. Deben ejecutarse tanto si no ha habido excepciones, como si las ha habido");
		}
		

	}

}
