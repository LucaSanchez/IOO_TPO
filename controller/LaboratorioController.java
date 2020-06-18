package controller;

import java.util.ArrayList;

import model.Paciente;
import model.Peticion;
import model.Practica;
import model.Resultado;
import model.Rol;
import model.Sucursal;
import model.Usuario;

public class LaboratorioController {
	
	ArrayList<Usuario> usuarios;
	ArrayList<Paciente> pacientes;
	ArrayList<Sucursal> sucursales;
	ArrayList<Practica> practicas;
	ArrayList<Peticion> peticiones;
	ArrayList<Resultado> resultados;
	ArrayList<Rol> roles;
	
	public LaboratorioController() {

		usuarios = new ArrayList<Usuario>();
		pacientes = new ArrayList<Paciente>();
		sucursales = new ArrayList<Sucursal>();
		practicas = new ArrayList<Practica>();
		peticiones = new ArrayList<Peticion>();
		resultados = new ArrayList<Resultado>();
		roles = new ArrayList<Rol>();
	}
	
	
	public Usuario buscarUsuario(String usr) {
		for (Usuario u : usuarios) {
			if (u.getNombre_usuario().equals(usr)) {
				return u;
			}
		}
		return null;
	}

	public void altaUsuario(String nombre_usuario, String mail,String password,String  nombre, String  domicilio,String  dni,String  fecha_nacimiento){
		
		if(buscarUsuario(nombre_usuario) == null){
			
			Usuario u = new Usuario(nombre_usuario, mail, password, nombre, domicilio, dni, fecha_nacimiento); //si no existe, creo nuevo user
			usuarios.add(u);
			System.out.println("El usuario " + nombre_usuario + " ha sido creado");
		} else { //si existe, salgo sin crearlo
			System.out.println("El usuario " + nombre_usuario + " ya existe en el sistema");
		}
	}

	public boolean bajaUsuario(String usr) {
		// busco al usuario en la lista de usuarios y lo borro si lo encuentro

		for (Usuario u : usuarios) {
			if (u.getNombre_usuario().equals(usr)) {
				usuarios.remove(u);
				System.out.println("El usuario " + usr + " ha sido borrado");
				return true;
			}
		}
		System.out.println("No se encontro el usuario: " + usr);
		return false;
	}

	public void modifUsuario(String nom, String dom, String mail, String usr, String pwd) {
		for (Usuario u : usuarios) {
			if (u.getNombre_usuario().equals(usr)) {
				u.setNombre(nom);
				u.setDomicilio(dom);
				u.setMail(mail);
				u.setPassword(pwd);
				System.out.println("El usuario " + usr + " ha sido modificado exitosamente");
				System.out.println("-------");
				System.out.println("Nombre: " + u.getNombre());
				System.out.println("Domicilio: " + u.getDomicilio());
				System.out.println("Mail: " + u.getMail());
				System.out.println("Password: " + u.getPassword());
				System.out.println("-------");
				return;
			}
		}
		System.out.println("El usuario " + usr + " no ha sido encontrado");
	}
	
	
	
	public Paciente buscarPaciente (String dni) {
		for (Paciente p : pacientes) {
			if (p.getDNI().equals(dni)) {
				return p;
			}
		}
		return null;
	}

	public void altaPaciente(String DNI, String nombre, String domicilio, String mail, String sexo, String edad){
		
		if(buscarPaciente(DNI) == null){
			
			Paciente p = new Paciente(nombre, mail, domicilio, DNI, edad, sexo); //si no existe, creo nuevo paciente
			pacientes.add(p);
			System.out.println("El paciente " + nombre + " ha sido creado");
		} else { //si existe, salgo sin crearlo
			System.out.println("El paciente " + nombre + " ya existe en el sistema");
		}
	}

	public boolean bajaPaciente(String dni) {
		// busco al paciente en la lista de pacientes y lo borro si lo encuentro.

		for (Paciente p : pacientes) {
			if (p.getDNI().equals(dni)) {
				pacientes.remove(p);
				System.out.println("El paciente " + dni + " ha sido borrado");
				return true;
			}
		}
		System.out.println("No se encontro el paciente: " + dni);
		return false;
	}

	public void modifPaciente(String nom, String dom, String mail, String dni, String edad, String sexo) {
		for (Paciente p : pacientes) {
			if (p.getDNI().equals(dni)) {
				p.setNombre(nom);
				p.setDomicilio(dom);
				p.setMail(mail);
				p.setSexo(sexo);
				p.setEdad(edad);
				System.out.println("El paciente " + dni + " ha sido modificado exitosamente");
				System.out.println("-------");
				System.out.println("Nombre: " + p.getNombre());
				System.out.println("Domicilio: " + p.getDomicilio());
				System.out.println("Mail: " + p.getMail());
				System.out.println("Sexo: " + p.getSexo());
				System.out.println("Edad: " + p.getSexo());
				System.out.println("-------");
				return;
			}
		}
		System.out.println("El usuario " + dni + " no ha sido encontrado");
	}
	
	
	
	public Sucursal buscarSucursal(String nro) {
		for (Sucursal s : sucursales) {
			if (s.getNumero().equals(nro)) {
				return s;
			}
		}
		return null;
	}

	public void altaSucursal(String numero, String direccion,String responsable_tecnico){
		
		if(buscarSucursal(numero) == null){
			
			Sucursal s = new Sucursal(numero, direccion, responsable_tecnico); //si no existe, creo nueva sucursal
			sucursales.add(s);
			System.out.println("La sucursal " + numero + " ha sido creada");
		} else { //si existe, salgo sin crearlo
			System.out.println("La sucursal " + numero + " ya existe en el sistema");
		}
	}

	public boolean bajaSucursal(String nro) {
		// busco la sucursal en la lista de sucursales y la borro si la encuentro

		for (Sucursal s : sucursales) {
			if (s.getNumero().equals(nro)) {
				sucursales.remove(s);
				System.out.println("La sucursal " + nro + " ha sido borrada");
				return true;
			}
		}
		System.out.println("No se encontro la sucursal: " + nro);
		return false;
	}

	public void modifSucursal(String nro, String dir, String respTec) {
		for (Sucursal s : sucursales) {
			if (s.getNumero().equals(nro)) {
				s.setDireccion(dir);
				s.setResponsable_tecnico(respTec);
				System.out.println("La sucursal " + nro + " ha sido modificada exitosamente");
				System.out.println("-------");
				System.out.println("Direccion: " + s.getDireccion());
				System.out.println("Domicilio: " + s.getResponsable_tecnico());
				System.out.println("-------");
				return;
			}
		}
		System.out.println("La sucursal " + nro + " no ha sido encontrada");
	}
	
	
	
	public Practica buscarPractica(String cod) {
		for (Practica c : practicas) {
			if (c.getCodigo_practica().equals(cod)) {
				return c;
			}
		}
		return null;
	}

	public void altaPractica(String codigo_practica, String nombre_practica, String grupo, String valores_criticos, String valores_reservados, String demora_resultado){
		
		if(buscarPractica(codigo_practica) == null){
			
			Practica c = new Practica(codigo_practica, nombre_practica, grupo, valores_criticos, valores_reservados, demora_resultado); //si no existe, creo nueva practica
			practicas.add(c);
			System.out.println("La practica " + codigo_practica + " ha sido creado");
		} else { //si existe, salgo sin crearlo
			System.out.println("La practica " + codigo_practica + " ya existe en el sistema");
		}
	}

	public boolean bajaPractica(String cod) {
		// busco la practica en la lista de practicas y la borro si la encuentro

		for (Practica c : practicas) {
			if (c.getCodigo_practica().equals(cod)) {
				practicas.remove(c);
				System.out.println("La practica " + cod + " ha sido borrada");
				return true;
			}
		}
		System.out.println("No se encontro la practica: " + cod);
		return false;
	}

	public void modifUsuario(String cod, String nom, String grupo, String valCriticos, String valReservados, String demora) {
		for (Practica c : practicas) {
			if (c.getCodigo_practica().equals(cod)) {
				c.setNombre_practica(nom);
				c.setGrupo(grupo);
				c.setValores_criticos(valCriticos);
				c.setValores_reservados(valReservados);
				c.setDemora_resultado(demora);
				System.out.println("La practica " + cod + " ha sido modificada exitosamente");
				System.out.println("-------");
				System.out.println("Nombre: " + c.getNombre_practica());
				System.out.println("Grupo: " + c.getGrupo());
				System.out.println("Valores Criticos: " + c.getValores_criticos());
				System.out.println("Valores Reservados: " + c.getValores_reservados());
				System.out.println("Demora de los resultados: " + c.getDemora_resultado());
				System.out.println("-------");
				return;
			}
		}
		System.out.println("La practica " + cod + " no ha sido encontrada");
	}
	
	public Peticion buscarPeticion(int idPeticion) {
		for (Peticion p : peticiones) {
			if (p.getId_peticion() == idPeticion) {
				return p;
			}
		}
		return null;
	}

	public void altaPeticion(String paciente, String obrasocial, String fecha_carga, String practicas_asociadas,
			String fecha_entrega) {

		Peticion p = new Peticion(paciente, obrasocial, fecha_carga, practicas_asociadas, fecha_entrega);
		peticiones.add(p);
	}

	public boolean bajaPeticion(int idPeticion) {
		// busco al usuario en la lista de usuarios y lo borro si lo encuentro

		for (Peticion p : peticiones) {
			if (p.getId_peticion() == idPeticion) {
				peticiones.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public void modifPeticion(int idPeticion, String paciente, String obrasocial, String fecha_carga, String practicas_asociadas,
			String fecha_entrega) {
		for (Peticion p : peticiones) {
			if(p.getId_peticion() == idPeticion) {
				p.setFecha_carga(fecha_carga);
				p.setFecha_entrega(fecha_entrega);
				p.setObrasocial(obrasocial);
				p.setPaciente(paciente);
				p.setPracticas_asociadas(practicas_asociadas);
				return;
			}
		}
	}
	
	public Resultado buscarResultado(int id_peticion, String codigo_practica) {
		for (Resultado r : resultados) {
			if (r.getCodigo_practica().equals(codigo_practica) && r.getId_peticion() == id_peticion) {
				return r;
			}
		}
		return null;
	}
	
	public void altaResultado(int id_peticion, String codigo_practica) {

		Resultado r = new Resultado(id_peticion, codigo_practica);
		resultados.add(r);
	}
	
	public void modifResultado(int id_peticion, String codigo_practica) {
		
		for(Resultado r : resultados) {
			if(r.getCodigo_practica().equals(codigo_practica) && r.getId_peticion() == id_peticion) {
				r.setCodigo_practica(codigo_practica);
				r.setId_peticion(id_peticion);
			}
		}
	}
	
}
