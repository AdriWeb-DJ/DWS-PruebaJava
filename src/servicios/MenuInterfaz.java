/**
 * 
 */
package servicios;

import java.io.IOException;
/**
 * Lista de los metodos de la interfaz
 * 
 * @author aprasto 10/10/2024
 */
public interface MenuInterfaz {
	/**
	 * Vista del menu principal
	 * 
	 * @return byte
	 * @author aprasto 10/10/2024
	 * @throws IOException
	 */
	byte MenuPrincipal() throws IOException;
	
	/**
	 * Vista del menu empleados
	 * 
	 * @return byte
	 * @author aprasto 10/10/2024
	 * @throws IOException
	 */
	
	byte MenuEmpleado() throws IOException;
	
	/**
	 * Vista del menu gerentes
	 * 
	 * @return byte
	 * @author aprasto 10/10/2024
	 * @throws IOException
	 */
	
	byte MenuGerente() throws IOException;

}
