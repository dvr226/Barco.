package Trabajo;
public class Barco {
	private String nombre, tipo;
	private int carga, pasajeros;
	
	public Barco(String nombre, String tipo, int carga, int pasajeros) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.carga = carga;
		this.pasajeros = pasajeros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", tipo=" + tipo + ", carga=" + carga + ", pasajeros=" + pasajeros + "]";
	}

	public void mostrardatos () {
		System.out.println(this.toString());	
	}
}
