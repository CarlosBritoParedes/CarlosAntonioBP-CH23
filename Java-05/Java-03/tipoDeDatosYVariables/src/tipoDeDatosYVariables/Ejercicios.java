package tipoDeDatosYVariables;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 1
		Declara 3 variables de tipo entero y utiliza el operador * y %<*/
		
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		int resultado1=var1*var2;
		int resultado2=var3%var2;
		
		System.out.println("Resultado de multiplicacion: " + var1 + "*" + var2 + " = " + resultado1);
		System.out.println("Resultado de modulo: " + var3 + "%" + var2 + " = " + resultado2);
		
		/*Ejercicio 2
		Declara dos variables de tipo boolean y utiliza el operador ==*/
		
		boolean varTrue = true;
		boolean varFalse = false;
		
		if(varTrue == true) {
			System.out.println("Es verdad");
		}
		else{
			System.out.println("Es mentira");
		}
		
		boolean trueOrFalse = varTrue == varFalse;
		System.out.println(trueOrFalse);
		
		
		/*Ejercicio 3
		Declara dos variables de tipo Double y utiliza el operador < */ 
		
		double varDouble1 = 3.1416;
		double varDouble2 = 9.81;
		boolean esMenor = varDouble1 < varDouble2;
		boolean esMayor = varDouble1 > varDouble2;
		
		System.out.println(esMenor);//true
		System.out.println(esMayor);//false
		
		
		/*Ejercicio 4
		Conversion de grados */
		
		byte centigrados = 1;
		double fahrenheit = (centigrados *1.8) + 32;
		double kelvin = centigrados +273.15;
		
		int centigradoss = 2;
		double conversion = centigradoss*255.928;
		
		
		System.out.println("1 centigrado a fahrenheit es" +fahrenheit);
		
		System.out.println("1 centigrado a kelvin es" + kelvin);
		
		System.out.println("1 fahrenheit a kelvin es" + conversion);
		
	}

}