package ar.edu.unju.edm.ejercicio5;
import ar.edu.unju.edm.ejercicio5.model.*;
public class Principal {

	public static void main(String[] args) {
		Calculos unCalculo = new Calculos();
		
		//Empleado numero 1
		//Constructor Default
		Empleado1 unEmpleado= new Empleado1();
		unEmpleado.setSueldoTotal(unCalculo.calcularSueldo(unEmpleado.getHorasTrabajadas()));
		System.out.println("----Empleado Numero 1----");
		System.out.println("Nombre: " + unEmpleado.getNombre());
		System.out.println("Legajo: " + unEmpleado.getLegajo());
		System.out.println("Horas trabajadas: " + unEmpleado.getHorasTrabajadas());
		System.out.println("Sueldo Total: $" + unEmpleado.getSueldoTotal());
		
		//Empleado numero 2
		//Constructor Parametrizado
		Empleado2 otroEmpleado= new Empleado2("Lourdes", 115, 400);
		otroEmpleado.setSueldoTotal(unCalculo.calcularSueldo(otroEmpleado.getHorasTrabajadas()));
		System.out.println("----Empleado Numero 2----");
		System.out.println("Nombre: " + otroEmpleado.getNombre());
		System.out.println("Legajo: " + otroEmpleado.getLegajo());
		System.out.println("Horas trabajadas: " + otroEmpleado.getHorasTrabajadas());
		System.out.println("Sueldo Total: $" + otroEmpleado.getSueldoTotal());
		
	}
}