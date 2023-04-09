package ar.edu.unju.edm.ejercicio4;
import ar.edu.unju.edm.ejercicio4.model.*;
public class Principal {

	public static void main(String[] args) {
		//Aqui estan las opciones para cambiar, tanto los limites como su paridad.
		String modo = "IMPAR";
		int limiteInferior= 1;
		int limiteSuperior= 50;
		
		Calculos unCalculo = new Calculos();
		
		unCalculo.determinarParOImpar(limiteInferior, limiteSuperior, modo);
		

	}

}
