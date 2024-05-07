package Trabajo;

public abstract class Tripulante {
	protected int ncarnet, edad,tiempoe;
	protected String nombre,telefono;
	protected char sexo;
	
	
	public Tripulante(int ncarnet, int edad, int tiempoe, String nombre, String telefono, char sexo) {
		super();
		this.ncarnet = ncarnet;
		this.edad = edad;
		this.tiempoe = tiempoe;
		this.nombre = nombre;
		this.telefono = telefono;
		this.sexo = sexo;
	}
	
	public int getNcarnet() {
		return ncarnet;
	}
	public void setNcarnet(int ncarnet) {
		this.ncarnet = ncarnet;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTiempoe() {
		return tiempoe;
	}
	public void setTiempoe(int tiempoe) {
		this.tiempoe = tiempoe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public abstract void sueldo();
	public abstract void mostrardatos();
}
