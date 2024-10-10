/**
 * 
 */
package servicios;

import java.io.IOException;
import java.util.Scanner;

/**
 * Implementacion de los menus de la lista MenuInterfaz
 * 
 * @author aprasto 10/10/2024
 */
public class MenuImplementacion implements MenuInterfaz {
	Scanner sc = new Scanner(System.in);

	@Override
	public byte MenuPrincipal() throws IOException{
		System.out.println("================MENU PRINCIPAL==================");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. Abrir Menu Empleado");
		System.out.println("2. Abrir Menu Gerencia");
		System.out.println("================================================");
		System.out.println("Seleccione una de las opciones anteriores: ");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public byte MenuEmpleado() throws IOException{
		System.out.println("================MENU EMPLEADOS==================");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. Calculo total de ventas mensuales");
		System.out.println("2. Añadir compras a clientes");
		System.out.println("================================================");
		System.out.println("Seleccione una de las opciones anteriores: ");
		byte opcion = sc.nextByte();
		return opcion;
	}

	@Override
	public byte MenuGerente() throws IOException{
		System.out.println("================MENU GERENTES==================");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. Crear Nuevo Cliente");
		System.out.println("===============================================");
		System.out.println("Seleccione una de las opciones anteriores: ");
		byte opcion = sc.nextByte();
		return opcion;
	}
	
	
}
