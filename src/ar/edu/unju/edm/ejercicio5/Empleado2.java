package ar.edu.unju.edm.ejercicio5;

public class Empleado2 {

	private String nombre;
	private int legajo;
	private String email;
	private float sueldoTotal;
	private float horasTrabajadas;
	private int fechaDeIngreso;
	
	public Empleado2(String nombre, int legajo, float horasTrabajadas) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(int fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
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

}
