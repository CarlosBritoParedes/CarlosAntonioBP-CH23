package com.generation.cabp.mains;

import java.util.*;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> coleccion = new ArrayList<String>();
		coleccion.add("colecciones");
		coleccion.add("cohorte");
		
		/*
		coleccion.add(13);
		coleccion.add(15.15);
		coleccion.add('a');*/
		
		for (int i = 0; i < coleccion.size(); i++) {
			System.out.println(coleccion.get(i));
		}
		
	}

}
