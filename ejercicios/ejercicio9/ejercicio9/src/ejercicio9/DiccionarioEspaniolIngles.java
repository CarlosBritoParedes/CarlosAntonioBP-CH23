package ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class DiccionarioEspaniolIngles {
	public static void main(String[] args) {
		
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Escribe la palabra que deseas traducir: ");
		String encontrarPalabra = sn1.next();
		
		HashMap<String, String> dicFood = new HashMap<>();
		
		dicFood.put("arroz", "rice");
		dicFood.put("pan", "bread");
		dicFood.put("postre", "dessert");
		dicFood.put("sopa", "soup");
		dicFood.put("bistec", "steak");
		dicFood.put("puerco", "pork");
		dicFood.put("pollo", "chicken");
		dicFood.put("pescado", "fish");
		dicFood.put("chocolate", "chocolate");
		dicFood.put("piña", "pineapple");
		dicFood.put("manzana", "apple");
		dicFood.put("leche", "milk");
		dicFood.put("fresa", "strawberry");
		dicFood.put("agua", "water");
		dicFood.put("vino", "wine");
		dicFood.put("jugo", "juice");
		dicFood.put("naranja", "orange");
		dicFood.put("platano", "banana");
		dicFood.put("ice cream", "helado");
		dicFood.put("refresco", "soda");
		
		if(dicFood.containsKey(encontrarPalabra)) {
			String palabraEncontrada = dicFood.get(encontrarPalabra);
			System.out.println("La palabra " + encontrarPalabra + " traducida al ingles es: " + palabraEncontrada);
		}
		else {
			System.out.println("Lo sentimos la palabra: " + encontrarPalabra + " no se encuentra en el diccionario");
		}
	}

}

