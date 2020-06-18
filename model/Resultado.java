package model;

public class Resultado {
	
	int id_peticion;
	String codigo_practica;
	
	public Resultado(int id_peticion, String codigo_practica) {
		super();
		this.id_peticion = id_peticion;
		this.codigo_practica = codigo_practica;
	}

	public int getId_peticion() {
		return id_peticion;
	}

	public void setId_peticion(int id_peticion) {
		this.id_peticion = id_peticion;
	}

	public String getCodigo_practica() {
		return codigo_practica;
	}

	public void setCodigo_practica(String codigo_practica) {
		this.codigo_practica = codigo_practica;
	}
	
	
}
