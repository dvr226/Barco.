package Trabajo;

public class Jefedeflota extends Tripulante {
	private int pesopez, pesomariscos;
	private int sueldo = 350000000;
	private float sueldototal, bonopez, bonomariscos;
	
	public Jefedeflota(int ncarnet, int edad, int tiempoe, String nombre, String telefono, char sexo, int pesopez,
			int pesomariscos, int sueldo, float sueldototal, float bonopez, float bonomariscos) {
		super(ncarnet, edad, tiempoe, nombre, telefono, sexo);
		this.pesopez = pesopez;
		this.pesomariscos = pesomariscos;
		this.sueldo = sueldo;
		this.sueldototal = sueldototal;
		this.bonopez = bonopez;
		this.bonomariscos = bonomariscos;
	}
	
	
	public int getPesopez() {
		return pesopez;
	}
	public void setPesopez(int pesopez) {
		this.pesopez = pesopez;
	}
	public int getPesomariscos() {
		return pesomariscos;
	}
	public void setPesomariscos(int pesomariscos) {
		this.pesomariscos = pesomariscos;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public float getSueldototal() {
		return sueldototal;
	}
	public void setSueldototal(float sueldototal) {
		this.sueldototal = sueldototal;
	}

	public float getBonopez() {
		return bonopez;
	}
	public void setBonopez(float bonopez) {
		this.bonopez = bonopez;
	}
	public float getBonomariscos() {
		return bonomariscos;
	}
	public void setBonomariscos(float bonomariscos) {
		this.bonomariscos = bonomariscos;
	}

	public void calcularbonos() {
		if (bonopez > 0) {
			bonopez = (pesopez *1);
		}
		if (pesomariscos > 0) {
			bonomariscos = (pesomariscos*2);
		}
		sueldototal = sueldo + bonomariscos + bonopez;
	}

	@Override
	public void sueldo() {
		// TODO Auto-generated method stub	
		sueldototal = sueldo + bonomariscos + bonopez;
	}

	@Override
	public void mostrardatos() {
		// TODO Auto-generated method stub	
		System.out.println("Datos del Jefe de lota: ");
        System.out.println("Sueldo Total: " + sueldototal);
	}	
}
