package com.cabp.clases;

public class AlumnoB extends PersonaP{
private int matriculas;
private double promedio;


public AlumnoB(int matriculas, double promedio) {

	
	this.matriculas = matriculas;
	this.promedio = promedio;
}
public int getMatriculas() {
	return matriculas;
}
public void setMatriculas(int matriculas) {
	this.matriculas = matriculas;
}
public double getPromedio() {
	return promedio;
}
public void setPromedio(double promedio) {
	this.promedio = promedio;
}
@Override
public String toString() {
	return "AlumnoB [matriculas=" + matriculas + ", promedio=" + promedio + "]";
}

}
