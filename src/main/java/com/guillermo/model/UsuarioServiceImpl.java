/**
 * 
 */
package com.guillermo.model;

import com.guillermo.services.UsuarioService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioServiceImpl.
 *
 * @author gcuevasf
 */
public class UsuarioServiceImpl implements UsuarioService {

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#consultaUsuario(com.guillermo.model.Usuario)
	 */
	public Usuario consultaUsuario(Usuario usuario) {
		System.out.println("Consultando el Usuario : " + usuario.getNombre() + " " +usuario.getApellidos());
		return usuario;
	}

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#consultaUsuario_alternativo(com.guillermo.model.Usuario)
	 */
	public Usuario consultaUsuario_alternativo(Usuario usuario) {
		System.out.println("Consultando el Usuario Alternativo : " + usuario.getNombre() + " " +usuario.getApellidos());
		return usuario;
	}

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#agregarUsuario(com.guillermo.model.Usuario)
	 */
	public boolean agregarUsuario(Usuario usuario) {
		System.out.println("Insertando Usuario : " + usuario);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#actualizarUsuario(com.guillermo.model.Usuario)
	 */
	public int actualizarUsuario(Usuario usuario) {
		System.out.println("Actualizando Usuario : " + usuario.getNombre());
		return 1;
	}

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#borrarUsuario(com.guillermo.model.Usuario)
	 */
	public boolean borrarUsuario(Usuario usuario) {
		System.out.println("Borrando el Usuario : " + usuario.getNombre());
		return true;
	}

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#procesarInformacion()
	 */
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

	/* (non-Javadoc)
	 * @see com.guillermo.services.UsuarioService#ProbarThrowException()
	 */
	public void ProbarThrowException() throws Exception {
		System.out.println("ProbarThrowException() esta corriendo ");
		throw new Exception("Generic Error");
	}

}
