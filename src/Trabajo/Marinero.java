package Trabajo;

public class Marinero extends Tripulante {
	private int pesototalpez;
	private float sueldo = 90000;
	private float sueldototal, bono;
	
	public Marinero(int ncarnet, int edad, int tiempoe, String nombre, String telefono, char sexo, int pesototalpez,
			float sueldo, float sueldototal, float bono) {
		super(ncarnet, edad, tiempoe, nombre, telefono, sexo);
		this.pesototalpez = pesototalpez;
		this.sueldo = sueldo;
		this.sueldototal = sueldototal;
		this.bono = bono;
	}
	
	public int getPesototalpez() {
		return pesototalpez;
	}
	public void setPesototalpez(int pesototalpez) {
		this.pesototalpez = pesototalpez;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public float getSueldototal() {
		return sueldototal;
	}
	public void setSueldototal(float sueldototal) {
		this.sueldototal = sueldototal;
	}
	public float getBono() {
		return bono;
	}
	public void setBono(float bono) {
		this.bono = bono;
	}
	
	public void calcularbono() {
		if (pesototalpez >= 1) {
			pesototalpez = (int)((pesototalpez*25)/100);
		}
		sueldototal = sueldo + bono;
	}

	@Override
	public void sueldo() {
		// TODO Auto-generated method stub
		sueldototal = sueldo + bono;
	}

	@Override
	public void mostrardatos() {
		// TODO Auto-generated method stub
		System.out.println("Datos del Marinero:");
        System.out.println("Sueldo Total: " + sueldototal);
	}
}
