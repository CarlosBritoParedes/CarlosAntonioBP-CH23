package ejercicioLogica6.ejercicio6;
import java.util.Scanner;

public class EnReversa {
	
	
	public static void main(String[] args) {
		Scanner sn1 = new Scanner(System.in);
		System.out.println("Dame una palabra: ");
		String palabra = sn1.next();

		System.out.println("La palabra es: " + palabra);
		System.out.println("Y su largo es: " + palabra.length());
		
		
	   String palabraReverse = "";
	   for (int i = palabra.length()-1; i >= 0; i--) {
		   palabraReverse += palabra.charAt(i);
	   }
	   System.out.println("La palabra en reversa es: " + palabraReverse);
		
	}
	}

