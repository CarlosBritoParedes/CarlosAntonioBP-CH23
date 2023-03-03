package Funciones;

public class FuncionTrigonometrica {
//Torre recta (90grados)
// Usar funciones de la libreria Math
//Impresiones en consola de todos los datos
//Datos del tipo double o float

	//Formula original: tan(0) = h/d
	//Despejada h = d*tan(0)
	
	public static double calculaAltura (double distancia, double angulo) {
		double altura = distancia * Math.tan(Math.toRadians(angulo));//Formula usando libreria Math
		return altura;
	}
}
