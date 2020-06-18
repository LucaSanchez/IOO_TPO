package model;

public class Usuario {
	
	String nombre_usuario;
	String mail;
	String password;
	String nombre;
	String domicilio;
	String dni;
	String fecha_nacimiento;
	
	public Usuario(String nombre_usuario, String mail, String password, String nombre, String domicilio, String dni,
			String fecha_nacimiento) {
		super();
		this.nombre_usuario = nombre_usuario;
		this.mail = mail;
		this.password = password;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
}
