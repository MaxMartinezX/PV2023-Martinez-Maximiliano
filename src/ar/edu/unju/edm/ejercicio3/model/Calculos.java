package ar.edu.unju.edm.ejercicio3.model;

public class Calculos {
	
	public void verificarCadaNumero(int numero) {
		
		Calculos unPrimo = new Calculos();
		
		//Empezamos desde el 2 ya que el 1 no se considera un numero primo
		for(int i=2; i<=numero; i++) {
			unPrimo.determinarPrimo(i);
		}
	}
	
	public void determinarPrimo (int numero) {
		int aux=0;
		//Dividimos el numero a la mitad ya que todo valor que sea mayor que la mitad es imposible que sea un divisor del numero
		for(int i= 2; i<=numero/2; i++) {
			if(numero%i==0) {
				aux++;
			}
		}
		if(aux==0) {
			System.out.print(numero + " ");
		}
	}

}
