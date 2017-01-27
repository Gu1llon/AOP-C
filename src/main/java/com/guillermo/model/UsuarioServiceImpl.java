/**
 * 
 */
package com.guillermo.model;

import com.guillermo.services.UsuarioService;

/**
 * @author gcuevasf
 *
 */
public class UsuarioServiceImpl implements UsuarioService {

	public Usuario consultaUsuario(Usuario usuario) {
		System.out.println("Consultando el Usuario : " + usuario.getNombre() + " " +usuario.getApellidos());
		return usuario;
	}

	public Usuario consultaUsuario_alternativo(Usuario usuario) {
		System.out.println("Consultando el Usuario Alternativo : " + usuario.getNombre() + " " +usuario.getApellidos());
		return usuario;
	}

	public boolean agregarUsuario(Usuario usuario) {
		System.out.println("Insertando Usuario : " + usuario);
		return true;
	}

	public int actualizarUsuario(Usuario usuario) {
		System.out.println("Actualizando Usuario : " + usuario.getNombre());
		return 1;
	}

	public boolean borrarUsuario(Usuario usuario) {
		System.out.println("Borrando el Usuario : " + usuario.getNombre());
		return true;
	}

	public void procesarInformacion() {
		try {
			Thread tarea = new Thread (new Runnable() {
				
				public void run() {
				}
			});
			tarea.start();
			tarea.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ProbarThrowException() throws Exception {
		System.out.println("ProbarThrowException() esta corriendo ");
		throw new Exception("Generic Error");
	}

}
