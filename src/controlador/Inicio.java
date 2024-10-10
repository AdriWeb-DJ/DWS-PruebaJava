package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dto.ClientesDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperacionesImplementacion;
import servicios.OperacionesInterfaz;

public class Inicio {
	
	public static List<ClientesDto> listaCliente = new ArrayList<ClientesDto>();
	public static MenuInterfaz mi = new MenuImplementacion();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		OperacionesInterfaz op = new OperacionesImplementacion();
		
		byte opcion;
		boolean esCerrado = false;
		/**
		 *Menu Principal
		 *
		 *@author aprasto 10/10/2024
		 */
		do {
			opcion = mi.MenuPrincipal();
			switch (opcion) {
			case 0:
				System.out.println("Menu cerrado. ¡Tenga un buen dia!");
				esCerrado = true;
				break;
			case 1:
				/**
				 *Menu Empleados
				 *
				 *@author aprasto 10/10/2024
				 */
				opcion = mi.MenuEmpleado();
				switch (opcion) {
				case 0:
					System.out.println("Menu cerrado. ¡Tenga un buen dia!");
					esCerrado = true;
					break;
				case 1:
					System.out.println("Abriendo calculo total de ventas mensuales.");
					break;
				case 2:
					System.out.println("Abriendo añadir compras a clientes.");
					break;
				default:
					System.out.println("ERROR: Opcion seleccionada no valida");
					break;
				}
				break;
			case 2:
				/**
				 *Menu Gerentes
				 *
				 *@author aprasto 10/10/2024
				 */
				opcion = mi.MenuGerente();
				switch (opcion) {
				case 0:
					System.out.println("Menu cerrado. ¡Tenga un buen dia!");
					esCerrado = true;
					break;
				case 1:
					System.out.println("Crear nuevo cliente seleccionado.");
					op.nuevoCliente();
					break;
				default:
					System.out.println("ERROR: Opcion seleccionada no valida");
					break;
				}
				break;
			default:
				System.out.println("ERROR: Opcion seleccionada no valida");
				break;
			}
		}while (!esCerrado);
/*
Para el DTO
Seleccionar todo, click derecho > Source > Getters and Setter > Generar
*/
	}

}
