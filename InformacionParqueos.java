import java.util.Scanner;
import java.util.ArrayList;

/**
* Programa para distribución y uso de parqueos.
* @author Mario Guerra
* @version 5/9/2021
* @see InformacionParqueos
*/

class InformacionParqueos{
	/**
	* Constructor para la clase de InformacionParqueos.
	*/
	String Vehiculo;
	String Horas;
	String Placa;
	String Marca;
	String Modelo;
	int espacio = 0;
	int contador = 0;
	/**
	* Fin del constructor de la clase de InformacionParqueos.
	*/
	
	/**
	* Método IngresoInfo
	* @param ArrayList<Info> - ArrayList que guardará los datos que se le pidan al usuario.
	*/
	public void IngresoInfo(){ //Método para ingresar datos de los vehículos.
		Scanner scan = new Scanner(System.in);
		ArrayList<String> Info = new ArrayList<String>();
		System.out.println("Escriba el tipo de vehiculo"); //El usuario debe escribir si se trata de un carro, avión, etc.
		System.out.println("Escriba el numero de horas que uso el parqueo"); //Tiempo estimado en que usó el parqueo.
		System.out.println("Escriba la placa del vehiculo"); //Placa del vehiculo en cuestión.
		System.out.println("Escriba la marca del vehiculo"); //Marca que fabricó el vehiculo.
		System.out.println("Escriba el modelo del vehiculo"); //Año de salida del vehiculo.
		Vehiculo = scan.next();
		Horas = scan.next();
		Placa = scan.next();
		Marca = scan.next();
		Modelo = scan.next();
		Info.add(Vehiculo); //En esta parte, se añade la información dada por el usuario a la lista "Info".
		Info.add(Horas);
		Info.add(Placa);
		Info.add(Marca);
		Info.add(Modelo);
		contador = contador + 1; //Contador que guarda el total de espacios usados.
		System.out.println("---------------------------------");
		Info.forEach(System.out::println); //Muestra la lista con los datos que dio el usuario.
		System.out.println("Desea anadir otro vehiculo?\n1. Si.\n2. No\n"); //Se decide si continúa con otro vehiculo en otro espacio o en el mismo.
		espacio = scan.nextInt();
		if (espacio == 1){ //Si el usuario marca 1, el programa se irá repitiendo con otra lista completamente distinta.
			ArrayList<String> Info2 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el tipo de vehiculo");
			System.out.println("Escriba el numero de horas que uso el parqueo");
			System.out.println("Escriba la placa del vehiculo");
			System.out.println("Escriba la marca del vehiculo");
			System.out.println("Escriba el modelo del vehiculo");
			Vehiculo = scan.next();
			Horas = scan.next();
			Placa = scan.next();
			Marca = scan.next();
			Modelo = scan.next();
			Info2.add(Vehiculo);
			Info2.add(Horas);
			Info2.add(Placa);
			Info2.add(Marca);
			Info2.add(Modelo);
			contador = contador + 1;
			System.out.println("---------------------------------");
			Info2.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro vehiculo?\n1. Si.\n2. No\n");
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Info3 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el tipo de vehiculo");
			System.out.println("Escriba el numero de horas que uso el parqueo");
			System.out.println("Escriba la placa del vehiculo");
			System.out.println("Escriba la marca del vehiculo");
			System.out.println("Escriba el modelo del vehiculo");
			Vehiculo = scan.next();
			Horas = scan.next();
			Placa = scan.next();
			Marca = scan.next();
			Modelo = scan.next();
			Info3.add(Vehiculo);
			Info3.add(Horas);
			Info3.add(Placa);
			Info3.add(Marca);
			Info3.add(Modelo);
			contador = contador + 1;
			System.out.println("---------------------------------");
			Info3.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro vehiculo?\n1. Si.\n2. No\n");
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Info4 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el tipo de vehiculo");
			System.out.println("Escriba el numero de horas que uso el parqueo");
			System.out.println("Escriba la placa del vehiculo");
			System.out.println("Escriba la marca del vehiculo");
			System.out.println("Escriba el modelo del vehiculo");
			Vehiculo = scan.next();
			Horas = scan.next();
			Placa = scan.next();
			Marca = scan.next();
			Modelo = scan.next();
			Info4.add(Vehiculo);
			Info4.add(Horas);
			Info4.add(Placa);
			Info4.add(Marca);
			Info4.add(Modelo);
			contador = contador + 1;
			System.out.println("---------------------------------");
			Info4.forEach(System.out::println); //Muestra la lista.
			System.out.println("Desea anadir otro vehiculo?\n1. Si.\n2. No\n");
			espacio = scan.nextInt();
		}
		if (espacio == 1){
			ArrayList<String> Info5 = new ArrayList<String>(); //Nueva lista agregada.
			System.out.println("Escriba el tipo de vehiculo");
			System.out.println("Escriba el numero de horas que uso el parqueo");
			System.out.println("Escriba la placa del vehiculo");
			System.out.println("Escriba la marca del vehiculo");
			System.out.println("Escriba el modelo del vehiculo");
			Vehiculo = scan.next();
			Horas = scan.next();
			Placa = scan.next();
			Marca = scan.next();
			Modelo = scan.next();
			Info5.add(Vehiculo);
			Info5.add(Horas);
			Info5.add(Placa);
			Info5.add(Marca);
			Info5.add(Modelo);
			contador = contador + 1;
			System.out.println("---------------------------------");
			Info5.forEach(System.out::println); //Muestra la lista.
		}
		if (espacio == 2){ //Si la respuesta es negativa, el programa puede continuar.
			System.out.println("Muy bien, puede continuar.");
		}
	}
}