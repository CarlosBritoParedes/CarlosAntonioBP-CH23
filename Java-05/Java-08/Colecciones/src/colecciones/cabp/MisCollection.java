package colecciones.cabp;

public class MisCollection {

	public static void main(String[] args) {

		wrapperClass();
	}
	
	
	
	static void wrapperClass() {
		//byte, short, char, long, float, int, double
			
			byte numeroB = -128;
			System.out.println("Tamaño de un byte " +Byte.SIZE);
			System.out.println("Valor Max "+Byte.MAX_VALUE);
			System.out.println("Valor Min "+Byte.MIN_VALUE);
			System.out.println("---> "+numeroB);
			
			int numeroI = -2137483648;
			System.out.println("Tamaño de un entero: "+Integer.BYTES);
			System.out.println("Tamaño de un entero: "+Integer.SIZE);
			System.out.println("Valor Max "+Integer.MAX_VALUE);
			System.out.println("Valor Min "+Integer.MIN_VALUE);
			System.out.println("---> "+numeroI);
			
			short numeroII = -21374;
			System.out.println("Tamaño de un entero: "+Short.BYTES);
			System.out.println("Tamaño de un entero: "+Short.SIZE);
			System.out.println("Valor Max "+Short.MAX_VALUE);
			System.out.println("Valor Min "+Short.MIN_VALUE);
			System.out.println("---> "+numeroII);
			
			long numeroIII = -2137421312;
			System.out.println("Tamaño de un entero: "+Long.BYTES);
			System.out.println("Tamaño de un entero: "+Long.SIZE);
			System.out.println("Valor Max "+Long.MAX_VALUE);
			System.out.println("Valor Min "+Long.MIN_VALUE);
			System.out.println("---> "+numeroIII);
			
		}

	
	
}