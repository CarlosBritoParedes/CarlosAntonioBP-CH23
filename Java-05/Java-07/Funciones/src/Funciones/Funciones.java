package Funciones;

public class Funciones {
	
	//Las funciones se puden declarar en cualquier lugar de la clase
    public static int sumar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }//Cierre sumar
    
    public static int resta (int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }//Cierre resta
    
    public static int multiplicar (int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }//Cierre multiplicar
    
    public static int dividir (int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }//Cierre dividir
    
    //Funciones para imprimir asteriscos
    public static void imprimirAsteriscos() {
    	System.out.println("*********************");
    }//Cierre imprimirAsteriscos
    
    //Funcion que combina distintos tipos de valores
    public static float sumaDecimal(float valor1, float valor2) {
    	float resultadoDecimal = valor1 + valor2; 
    	return resultadoDecimal;
    }//Cierre sumaDecimal
    
    //Funcion para preparar aguita de limon
    public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
    	String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
    	return recetaCompletada;
    }

	public static void main(String[] args) {
		System.out.println("El resultado de la suma es: "+ sumar(5,8));
		
		System.out.println("El resultado de la resta es: "+ resta(5,8));
		
		System.out.println("El resultado de la multiplicacion es: "+ multiplicar(5,8));
		
		System.out.println("El resultado de la division es: "+ dividir(5,8));
		
		imprimirAsteriscos();
		
		System.out.println("El resultado de la division es: "+ sumaDecimal(5.7f,5));
		
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos para preparar aguita de limon: "+ awitaDeLimon("agua", "limon", "azucar"));
		
		
		//Funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.65497834d;
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.sqrt(valorEjemplo));
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.sin(valorEjemplo));
		
		System.out.println("La raiz cuadrada de mi valores : " + Math.pow(valorEjemplo,2));

	}//Cierrre de funcion main

}


/*
 
 Funciones 
 	
 	- No retornan valores: No devuelven nada, nose especifica nada, y no usamos la palabra return.
 	- Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y se usa return para esto.
 
 */


/*Levantamiento de requerimientos

- Torre es recta (90grados)
- Usen funciones de la librera Math
- Tiempo es de 20 minutos
- Impresiones en consola de todos los datos
    / tu base es de
    / tu altura
- Datos del tipo double o float*/


