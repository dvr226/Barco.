package Trabajo;

public class Capitan extends Tripulante{
	private float horasexp, sueldototal, bono;
	private int sueldoc = 4500000;
	
	
	
	public Capitan(int ncarnet, int edad, int tiempoe, String nombre, String telefono, char sexo, float horasexp,
			float sueldototal, float bono, int sueldoc) {
		super(ncarnet, edad, tiempoe, nombre, telefono, sexo);
		this.horasexp = horasexp;
		this.sueldototal = sueldototal;
		this.bono = bono;
		this.sueldoc = sueldoc;
	}
	public float getHorasexp() {
		return horasexp;
	}
	public void setHorasexp(float horasexp) {
		this.horasexp = horasexp;
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
	public int getSueldoc() {
		return sueldoc;
	}
	public void setSueldoc(int sueldoc) {
		this.sueldoc = sueldoc;
	}
	
	public void calcularbono(float bono, float sueldoc, float sueldototal) {
		
		if(horasexp >= 5000 && horasexp < 150000) {
			bono = (float) 0.2*sueldoc;
			sueldototal= (sueldoc+bono);
		}
		else if (horasexp >=150000 && horasexp < 300000){
			bono=(float) 0.4*sueldoc;
			sueldototal= (sueldoc+bono);
		}
		else if (horasexp >= 300000) {
			bono=(float) 0.75*sueldoc;
			sueldototal= (sueldoc+bono);
			
		}			
	}
	@Override
	public void sueldo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mostrardatos() {
		// TODO Auto-generated method stub
		System.out.println("**Datos del Capitán:**");
        System.out.println("Sueldo Total: " + sueldototal);
    }
}

