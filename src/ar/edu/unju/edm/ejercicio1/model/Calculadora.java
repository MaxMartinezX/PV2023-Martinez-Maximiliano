package ar.edu.unju.edm.ejercicio1.model;

public class Calculadora {

	public void calcularBisiesto(int año) {
		
		if( año%4==0 && año%100!=0 || año%400==0) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
		
	}
}
