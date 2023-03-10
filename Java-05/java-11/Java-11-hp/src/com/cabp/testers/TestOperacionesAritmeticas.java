package com.cabp.testers;

import com.cabp.clases.Mensajes;
import com.cabp.clases.OperacioneAritmeticas;
import com.cabp.clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma(5, 2);
		OperacioneAritmeticas ss = new Suma(10, 3);
		Mensajes sss = new Suma();

		System.out.println("Suma " + s.sumar());
		System.out.println("Operaciones Aritemeticas " + ss.sumar());
		s.mensaje();
		sss.mensaje();

	}

}
