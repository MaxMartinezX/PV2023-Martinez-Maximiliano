package ar.edu.unju.edm.ejercicio4.model;

public class Calculos {
	public void determinarParOImpar(int limiteInferior, int limiteSuperior, String modo) {
		if(modo=="PAR") {
			for(int i=limiteInferior; i<=limiteSuperior; i++) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
			}
		}else if(modo=="IMPAR") {
			for(int i=limiteInferior; i<=limiteSuperior; i++) {
				if(i%2!=0) {
					System.out.print(i + " ");
				}
			}
		}else {
		System.out.println("Valor Invalido");
		}
	}
}