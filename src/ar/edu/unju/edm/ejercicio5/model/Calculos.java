package ar.edu.unju.edm.ejercicio5.model;

public class Calculos {
	public float calcularSueldo(float horas) {
		float sueldoTotal = 0;
		if (horas >= 160) {
			sueldoTotal=160*4000;
			horas=horas-160;
			
			sueldoTotal=sueldoTotal+horas*5500;
		}else {
			sueldoTotal= horas*4400;
		}
		return sueldoTotal;
	}
}
