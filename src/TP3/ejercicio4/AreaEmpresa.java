package TP3.ejercicio4;

public class AreaEmpresa {
	private String identificacion;
	private int tardanza;
	
	
	public AreaEmpresa(String identificacion, int tardanza) {
		super();
		this.identificacion = identificacion;
		this.tardanza = tardanza;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public int getTardanza() {
		return tardanza;
	}


	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
	
	
}