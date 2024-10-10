/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

import controlador.Inicio;
import dto.ClientesDto;

/**
 * 
 */
public class OperacionesImplementacion implements OperacionesInterfaz {
	Scanner sc = new Scanner(System.in);
	
	public static long CalcularId() {
		long idNuevo = 0;
		int casillasLista = Inicio.listaCliente.size();

		if (casillasLista > 0) {
			idNuevo = Inicio.listaCliente.get(casillasLista - 1).getIdCliente() + 1;
		} else {
			idNuevo = 1;
		}

		return idNuevo;
	}
	@Override
	public void nuevoCliente() throws IOException {
		boolean esCerrado = false;
		do {
			long id = CalcularId();
			System.out.println("Ingrese el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Ingrese los apellidos: ");
			String apellidos = sc.nextLine();
			sc.nextLine();
			
			ClientesDto nuevoCliente = new ClientesDto();
			
			nuevoCliente.setIdCliente(id);
			nuevoCliente.setNombreCliente(nombre);
			nuevoCliente.setApellidoCliente(apellidos);
			
			Inicio.listaCliente.add(nuevoCliente);
			
			System.out.println("El cliente a sido registrado con exito.");
			
			System.out.println("¿Desea crear otro cliente? (Si o No)");
			String respuesta = sc.nextLine();

			if (respuesta.equalsIgnoreCase("Si")) {
				nuevoCliente();
			}
			else if (respuesta.equalsIgnoreCase("No")) {
				System.out.println("No desea crear mas clientes, cerrando...");
				esCerrado = true;
			}
			
		}while (!esCerrado);
	}
	
	
}
