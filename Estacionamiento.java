import java.util.Scanner;
import java.util.ArrayList;

/**
* Clase para encontrar los cinco espacios de parqueo ya contemplados.
* @author Mario Guerra
* @version 5/9/2021
* @see Estacionamiento
*/

class Estacionamiento{
	/**
	* Constructor para la clase de InformacionParqueos.
	*/
	String Largo;
	String Ancho;
	String Altura;
	String Caracteristicas;
	int espacio = 0;
	int contador = 0;
	/**
	* Fin del constructor de la clase de InformacionParqueos.
	*/
	
	/**
	* Método IngresoEstacionamiento
	* @param ArrayList<Estacionamiento> - ArrayList que guardará los datos de los parqueos que se darán de acuerdo a las instrucciones del usuario.
	*/
	public void IngresoEstacionamiento(){ //Método para ingresar los datos de los parqueos.
		Scanner scan = new Scanner(System.in);
		ArrayList<String> Estacionamiento = new ArrayList<String>(); //Lista creada para almacenar los datos que se proporcionen.
		System.out.println("Escriba el largo del parqueo.");
		System.out.println("Escriba el ancho del parqueo.");
		System.out.println("Escriba la altura del parqueo.");
		System.out.println("Escriba si el parqueo es techado o si es aéreo.");
		Largo = scan.next();
		Ancho = scan.next();
		Altura = scan.next();
		Caracteristicas = scan.next();
		Estacionamiento.add(Largo); //Se añaden las dimensiones y características de los parqueos.
		Estacionamiento.add(Ancho);
		Estacionamiento.add(Altura);
		Estacionamiento.add(Caracteristicas);
		contador = contador + 1; //Contador que guarda el numero de espacios que se están llenando.
		System.out.println("---------------------------------");
		Estacionamiento.forEach(System.out::println); //Muestra la lista.
		System.out.println("Desea anadir otro espacio de parqueo?\n1. Si\n2. No\n"); //Se decide si continúa agregando parqueos o si no quiere agregar más.
		espacio = scan.nextInt();
		if (espacio == 1){ //Si marca 1, el método se repite hasta que sean 5 espacios.
			ArrayList<String> Estacionamiento2 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el largo del parqueo.");
			System.out.println("Escriba el ancho del parqueo.");
			System.out.println("Escriba la altura del parqueo.");
			System.out.println("Escriba si el parqueo es techado o si es aéreo.");
			Largo = scan.next();
			Ancho = scan.next();
			Altura = scan.next();
			Caracteristicas = scan.next();
			Estacionamiento2.add(Largo);
			Estacionamiento2.add(Ancho);
			Estacionamiento2.add(Altura);
			Estacionamiento2.add(Caracteristicas);
			System.out.println("---------------------------------");
			Estacionamiento2.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro espacio de parqueo?\n1. Si\n2. No\n");
			contador = contador + 1;
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Estacionamiento3 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el largo del parqueo.");
			System.out.println("Escriba el ancho del parqueo.");
			System.out.println("Escriba la altura del parqueo.");
			System.out.println("Escriba si el parqueo es techado o si es aéreo.");
			Largo = scan.next();
			Ancho = scan.next();
			Altura = scan.next();
			Caracteristicas = scan.next();
			Estacionamiento3.add(Largo);
			Estacionamiento3.add(Ancho);
			Estacionamiento3.add(Altura);
			Estacionamiento3.add(Caracteristicas);
			System.out.println("---------------------------------");
			Estacionamiento3.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro espacio de parqueo?\n1. Si\n2. No\n");
			contador = contador + 1;
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Estacionamiento4 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el largo del parqueo.");
			System.out.println("Escriba el ancho del parqueo.");
			System.out.println("Escriba la altura del parqueo.");
			System.out.println("Escriba si el parqueo es techado o si es aéreo.");
			Largo = scan.next();
			Ancho = scan.next();
			Altura = scan.next();
			Caracteristicas = scan.next();
			Estacionamiento4.add(Largo);
			Estacionamiento4.add(Ancho);
			Estacionamiento4.add(Altura);
			Estacionamiento4.add(Caracteristicas);
			System.out.println("---------------------------------");
			Estacionamiento4.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro espacio de parqueo?\n1. Si\n2. No\n");
			contador = contador + 1;
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Estacionamiento5 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el largo del parqueo.");
			System.out.println("Escriba el ancho del parqueo.");
			System.out.println("Escriba la altura del parqueo.");
			System.out.println("Escriba si el parqueo es techado o si es aéreo.");
			Largo = scan.next();
			Ancho = scan.next();
			Altura = scan.next();
			Caracteristicas = scan.next();
			Estacionamiento5.add(Largo);
			Estacionamiento5.add(Ancho);
			Estacionamiento5.add(Altura);
			Estacionamiento5.add(Caracteristicas);
			System.out.println("---------------------------------");
			Estacionamiento5.forEach(System.out::println); //Muestra la lista.
		}
		if (espacio == 2){ //Si marca 2, el programa continuará normalmente.
			System.out.println("Muy bien, puede continuar.");
		}
	}
}