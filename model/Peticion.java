package model;

public class Peticion {
	
	int id_peticion;
	String paciente;
	String obrasocial;
	String fecha_carga;
	String practicas_asociadas;
	String fecha_entrega;
	
	public Peticion(String paciente, String obrasocial, String fecha_carga, String practicas_asociadas,
			String fecha_entrega) {
		super();
		this.paciente = paciente;
		this.obrasocial = obrasocial;
		this.fecha_carga = fecha_carga;
		this.practicas_asociadas = practicas_asociadas;
		this.fecha_entrega = fecha_entrega;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getObrasocial() {
		return obrasocial;
	}

	public void setObrasocial(String obrasocial) {
		this.obrasocial = obrasocial;
	}

	public String getFecha_carga() {
		return fecha_carga;
	}

	public void setFecha_carga(String fecha_carga) {
		this.fecha_carga = fecha_carga;
	}

	public String getPracticas_asociadas() {
		return practicas_asociadas;
	}

	public void setPracticas_asociadas(String practicas_asociadas) {
		this.practicas_asociadas = practicas_asociadas;
	}

	public String getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	
	
}
