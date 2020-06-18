package model;

public class Paciente {
	String DNI;
	String nombre;
	String domicilio;
	String mail;
	String sexo;
	String edad;
	
	public Paciente(String dNI, String nombre, String domicilio, String mail, String sexo, String edad) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.mail = mail;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	

}
