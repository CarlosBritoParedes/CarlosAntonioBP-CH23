package ejercicioLogica8.numerosPrimos;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumerosPrimos {
	public static void main(String[] args) {
		//Creando array
        int tenNumbers[];
        tenNumbers = new int [10];
        
        int primeArray[];
        primeArray = new int [10];
 
        //Creando un nuevo array de numeros primos
        ArrayList <Integer> primosArray = new ArrayList <Integer>();
        Collection<Integer> primosCollection = new ArrayList<Integer>();
        List<Integer> noPrimeList = new ArrayList<Integer>();
        
        List<Integer> primeList = new ArrayList<Integer>();
        
        
        //Creando objeto Scanner
        Scanner sn1 = new Scanner(System.in);
        
        //Llenando el array con los valores que me dio el usuario
        for (int i = 0; i < tenNumbers.length; i++) {
            System.out.println("Ingresa el valor en la posicion: " + i + " ");
            int element = Integer.parseInt(sn1.next());
            tenNumbers[i] = element;
        }
        System.out.println("Primera Lista desordenada:");
        for (int j = 0; j < tenNumbers.length; j ++) {
        	System.out.println("Indice: " + j + " - " + tenNumbers[j]);
        }
        System.out.println();
        
        //for cycle to determine if any number is Prime and add to the new list
        for(int k = 0; k < tenNumbers.length; k ++) {
        	if(tenNumbers[k] < 2) {
        	}
        	else if(tenNumbers[k] == 2) {
        		primeList.add(tenNumbers[k]);
        		
        	}
        	else {
        		boolean isPrime = true;
        		for(int l = 2; l < tenNumbers[k]; l ++) {
        			if(tenNumbers[k] % l == 0) {
        				isPrime = false;
        				break;
        			}
        		}
        		if(isPrime == true) {
        			primeList.add(tenNumbers[k]);
        		}
        	}
        }    
      //for cycle to determine if any number is NOT Prime and add to the new list
        for(int k = 0; k < tenNumbers.length; k ++) {
        	if(tenNumbers[k] < 2) {
        		primeList.add(tenNumbers[k]);
        	}
        	else if(tenNumbers[k] == 2) {
        	}
        	else {
        		boolean isPrime = true;
        		for(int l = 2; l < tenNumbers[k]; l ++) {
        			if(tenNumbers[k] % l == 0) {
        				primeList.add(tenNumbers[k]);
        				isPrime = false;
        				break;
        			}
        		}
        		if(isPrime == true) {
        		}
        	}
        }
        
        System.out.println("Segunda lista modificada con numeros primos al inicio:");
        for(int n = 0; n < primeList.size(); n ++) {
        	System.out.println("Indice: " + n + " - " + primeList.get(n));
        }
        }
	}

