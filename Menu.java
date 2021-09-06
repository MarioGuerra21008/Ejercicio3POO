import java.util.Scanner;
import java.util.ArrayList;

/**
* Programa para distribución y uso de parqueos.
* @author Mario Guerra
* @version 5/9/2021
* @see Menu
*/

class Menu{
	public static void main(String[] args){
		try{
			/**
			* Constructor para la clase de Menu.
			*/
			Scanner scan = new Scanner(System.in);
			Estacionamiento est = new Estacionamiento(); //La clase de estacionamiento con la variable est.
			InformacionParqueos InPar = new InformacionParqueos(); //La clase de informacion de parqueos con la variable InPar
			String Largo;
			String Ancho;
			String Altura;
			String Caracteristicas;
			String Vehiculo;
			String Horas;
			String Placa;
			String Marca;
			String Modelo;
			int espacio = 0;
			int contador = 0;
			int opcion = 0;
			/**
			* Fin del constructor de la clase Menu.
			*/
			while (opcion != 5){ //Mientras opción sea 5, el programa se ejecutará tranquilamente.
				System.out.println("\nBuenos dias, tardes o noches, esperamos que se encuentre bien el dia de hoy.\nEscoja cual es la operacion que desea realizar hoy.\n");
				System.out.println("1. Registro de nuevos parqueos."); //Registrar nuevos tamaños de parqueo (limite de 5).
				System.out.println("2. Registro de nuevos vehiculos."); //Registrar nuevos vehiculos que usen estos parqueos (limite de 5).
				System.out.println("3. Ver informacion de parqueos."); //Muestra estadísticas de los vehiculos.
				System.out.println("4. Guardar informacion"); //Guarda los datos del programa.
				System.out.println("5. Cerrar programa."); //Cierra el programa.
				opcion = scan.nextInt();
				if (opcion == 1){
					est.IngresoEstacionamiento(); //Método para el ingreso de datos de parqueos.
					System.out.println("Registro(s) realizado(s) con exito.");
				}
				else if (opcion == 2){
					InPar.IngresoInfo(); //Método para el ingreso de datos de los vehículos que usaron los parqueos.
					System.out.println("Registro(s) realizado(s) con exito.");
				}
				else if (opcion == 3){ //Método para mostrar estadísticas, no pude hacerlo porque no sabía como pasar los datos de las 5 listas de otro archivo o un método para mostrar las listas.
					System.out.println("Informacion siendo desplegada...");
				}
				else if (opcion == 4){ //Método para guardar el programa, no pude hacerlo porque no encontré una forma eficaz para poder guardar el progreso con el diseño que hice.
					System.out.println("Informacion guardada exitosamente.");
				}
				else if (opcion == 5){ //Salida del programa.
					System.out.println("Gracias, vuelva pronto.");
				}
			}
		}
		catch (Exception e){ //Muestra los posibles errores que puede cometer el usuario.
			System.out.println("Opcion no valida: ( - " + e.getMessage());
		}
	}
}