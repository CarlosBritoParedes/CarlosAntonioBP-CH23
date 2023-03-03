package colecciones.cabp;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		// wrapperClass();
		//imprimir(c.listasCollections());
		//imprimir(c.setCollecctions());
		mapCollections();
		
		
		
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor1", "Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		//miMap.clear();
		miMap.remove("valor3");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
		

	}


	Set setCollecctions() {
	Set miSet = new HashSet();
	miSet.add("uno");
	miSet.add("dos");
	miSet.add("tres");
	miSet.add("cuatro");
	miSet.add("cinco");
	return miSet;

	}

	private List listasCollections() {
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		miLista.add(1);
		miLista.add(0, 2);
		miLista.add(3);
		miLista.add(0, "Pato");
		miLista.set(0, miLista);
		miLista.remove(2);
		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());

		boolean e = miLista.contains(2);
		System.out.println("--->" + e);

		return miLista;

	}

	private static void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
		}
	}

	static void wrapperClass() {
		// byte, short, char, long, float, int, double

		byte numeroB = -128;
		System.out.println("Tamaño de un byte " + Byte.SIZE);
		System.out.println("Valor Max " + Byte.MAX_VALUE);
		System.out.println("Valor Min " + Byte.MIN_VALUE);
		System.out.println("---> " + numeroB);

		int numeroI = -2137483648;
		System.out.println("Tamaño de un entero: " + Integer.BYTES);
		System.out.println("Tamaño de un entero: " + Integer.SIZE);
		System.out.println("Valor Max " + Integer.MAX_VALUE);
		System.out.println("Valor Min " + Integer.MIN_VALUE);
		System.out.println("---> " + numeroI);

		short numeroII = -21374;
		System.out.println("Tamaño de un entero: " + Short.BYTES);
		System.out.println("Tamaño de un entero: " + Short.SIZE);
		System.out.println("Valor Max " + Short.MAX_VALUE);
		System.out.println("Valor Min " + Short.MIN_VALUE);
		System.out.println("---> " + numeroII);

		long numeroIII = -2137421312;
		System.out.println("Tamaño de un entero: " + Long.BYTES);
		System.out.println("Tamaño de un entero: " + Long.SIZE);
		System.out.println("Valor Max " + Long.MAX_VALUE);
		System.out.println("Valor Min " + Long.MIN_VALUE);
		System.out.println("---> " + numeroIII);

	}
}
