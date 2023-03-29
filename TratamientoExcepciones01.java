public class TratamientoExcepciones01 {


	public static void main(String[] args) {
		
		
		try {
			int a = 2;
			int b = 0;
			System.out.println(a/b); //Error de division entre 0			
		} catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.err.println("Error: " + ex.getMessage());
		}
		
		System.out.println("\nMensaje tras la division");

	}

}
