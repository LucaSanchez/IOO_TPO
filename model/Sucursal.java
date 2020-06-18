package model;

public class Sucursal {
	String numero;
	String direccion;
	String responsable_tecnico;
	
	public Sucursal(String numero, String direccion, String responsable_tecnico) {
		super();
		this.numero = numero;
		this.direccion = direccion;
		this.responsable_tecnico = responsable_tecnico;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getResponsable_tecnico() {
		return responsable_tecnico;
	}

	public void setResponsable_tecnico(String responsable_tecnico) {
		this.responsable_tecnico = responsable_tecnico;
	}
	
	
	
}
