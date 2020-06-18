package model;

public class Practica {
	
	String codigo_practica;
	String nombre_practica;
	String grupo;
	String valores_criticos;
	String valores_reservados;
	String demora_resultado;
	
	public Practica(String codigo_practica, String nombre_practica, String grupo, String valores_criticos,
			String valores_reservados, String demora_resultado) {
		super();
		this.codigo_practica = codigo_practica;
		this.nombre_practica = nombre_practica;
		this.grupo = grupo;
		this.valores_criticos = valores_criticos;
		this.valores_reservados = valores_reservados;
		this.demora_resultado = demora_resultado;
	}

	public String getCodigo_practica() {
		return codigo_practica;
	}

	public void setCodigo_practica(String codigo_practica) {
		this.codigo_practica = codigo_practica;
	}

	public String getNombre_practica() {
		return nombre_practica;
	}

	public void setNombre_practica(String nombre_practica) {
		this.nombre_practica = nombre_practica;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getValores_criticos() {
		return valores_criticos;
	}

	public void setValores_criticos(String valores_criticos) {
		this.valores_criticos = valores_criticos;
	}

	public String getValores_reservados() {
		return valores_reservados;
	}

	public void setValores_reservados(String valores_reservados) {
		this.valores_reservados = valores_reservados;
	}

	public String getDemora_resultado() {
		return demora_resultado;
	}

	public void setDemora_resultado(String demora_resultado) {
		this.demora_resultado = demora_resultado;
	}
	
	
	

}
