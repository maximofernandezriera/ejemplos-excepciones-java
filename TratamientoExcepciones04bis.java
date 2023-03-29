public class TratamientoExcepciones04bis {

	public static void main(String[] args) {

		//String[] mensajes = { "En un lugar", "de La Mancha", "de cuyo nombre", "no quiero acordarme" };
		String[] mensajes = { "En un lugar", null, "de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo viv�a" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(mensajes[i].toUpperCase());
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Tratamiento particular a las excepcion ArrayIndex...");
		} catch (NullPointerException ex) {
			System.err.println("Tratamiento particular a la excepcion NullPointer...");
		}
		
		System.out.println("Mensaje final");

	}

}
