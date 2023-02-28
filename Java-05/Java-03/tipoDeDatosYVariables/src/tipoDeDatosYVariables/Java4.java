package tipoDeDatosYVariables;

import java.time.temporal.ValueRange;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) { //siempre tiene que ser verdadero. Los dos tienen que ser true
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) { //Con que una de las condiciones se cumpla, es Juan Pérez 
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		/*boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}*/
		
		boolean esVerdadero = false;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		
		//Ejercicio1
		//Verificar si un número es par y positivo:
			int num = 6;
			if (num>0 & num % 2 == 0) {
				System.out.println("Tu numero es par y positivo");
			}
			else {
				System.out.println("Tu numero no es par y no es positivo");
			}
			
		
		//Ejercicio2
		//Verificar si un número está dentro de un rango específico
		//int num = 10;

			int num2 = 10;
			if (num2 >= 10 && num2 < 20) {
				System.out.println("Esta dentro del rango");
			}else {
				System.out.println("No esta dentro del rango");
			}
			
			
		//Ejercicio3
		//Verificar si una cadena es igual a otra o no
			String cadena1 = "Hola";
			String cadena2 = "hola";
			
			if(cadena1 == cadena2) {
				System.out.println("Son iguales");
			}else {
				System.out.println("No son iguales");
			}
	}

}
