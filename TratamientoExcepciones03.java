public class TratamientoExcepciones03 {

	public static void main(String[] args) {
		
		try {
			int a = 2;
			int b = 0;
			//1. Error de division entre 0	
			int resultado = a/b;
			String mensaje = null;
			//2. Error de length de vacio
			System.out.println(mensaje.length()); 					
		} catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.err.println("Error de division: " + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("Se ha producido un error no esperado");
		}
		

	}

}
