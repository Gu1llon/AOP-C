/**
 * 
 */
package com.guillermo.services;

import com.guillermo.model.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface UsuarioService.
 *
 * @author gcuevasf
 */
public interface UsuarioService {
		
		/**
		 * Consulta usuario.
		 *
		 * @param usuario the usuario
		 * @return the usuario
		 */
		public Usuario consultaUsuario( Usuario usuario );
		
		/**
		 * Consulta usuario alternativo.
		 *
		 * @param usuario the usuario
		 * @return the usuario
		 */
		public Usuario consultaUsuario_alternativo( Usuario usuario );
	    
    	/**
    	 * Agregar usuario.
    	 *
    	 * @param usuario the usuario
    	 * @return true, if successful
    	 */
    	public boolean agregarUsuario( Usuario usuario );
	    
    	/**
    	 * Actualizar usuario.
    	 *
    	 * @param usuario the usuario
    	 * @return the int
    	 */
    	public int actualizarUsuario( Usuario usuario );
	    
    	/**
    	 * Borrar usuario.
    	 *
    	 * @param usuario the usuario
    	 * @return true, if successful
    	 */
    	public boolean borrarUsuario( Usuario usuario );
	    
    	/**
    	 * Procesar informacion.
    	 */
    	public void procesarInformacion();
	    
    	/**
    	 * Probar throw exception.
    	 *
    	 * @throws Exception the exception
    	 */
    	public void ProbarThrowException() throws Exception;
}
