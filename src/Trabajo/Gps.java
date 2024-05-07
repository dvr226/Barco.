package Trabajo;

public class Gps {
	private String x, y, fecha, hora;
	private int diatripulado;
	
	public Gps(String x, String y, String fecha, String hora, int diatripulado) {
		super();
		this.x = x;
		this.y = y;
		this.fecha = fecha;
		this.hora = hora;
		this.diatripulado = diatripulado;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getDiatripulado() {
		return diatripulado;
	}

	public void setDiatripulado(int diatripulado) {
		this.diatripulado = diatripulado;
	}
}
