package ar.edu.unju.edm.ejercicio5;

public class Empleado1 {
	private String nombre;
	private int legajo;
	private String email;
	private float sueldoTotal;
	private float horasTrabajadas;
	private int fechaDeIngreso;

	public Empleado1() {
	
		nombre= "Max";
		legajo= 100;
		email= "maxipro328@gmail.com";
		horasTrabajadas= 300;
		fechaDeIngreso= 21042020;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(float sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}

	public float getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(float horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(int fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	
}
