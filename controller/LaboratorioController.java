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
		System.out.println("No se encontre el usuario: " + usr);
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
	
	
	
}
