package clases;
import java.util.Scanner;
public class NuevoHola {
	private String nombre;
	// para inicializar la variable (objeto de tipo string)
	//usamos el metodo contructor
	
	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez " + this.nombre);
	}
	
	public void saludoConNombre() {
		System.out.println("Hola tu eres: " + this.nombre);
	}
	
	
	
	
}
