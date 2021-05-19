package CrearCine;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		var opcion=0;
		// seleciona la opcion del menu de inicio
		int contadorEspectadores = 0; // contabiliza el Aforo de espectadores
		var crearSala= false; // controla si almenos hay una sala creada
		int seleccionsala=0; // guarda la seleccion de la sala a la que queremos añadir una pelicula
		
		Scanner sc = new Scanner(System.in);
		// recogida de datos
		
		Pelicula conductor = new Pelicula();  // trasporte a Classe Pelicula
		Espectador conductor2 = new Espectador(); // trasporte a Classe Espectador
		Asientos conductor3 = new Asientos();// trasporte a Classe Asientos
		Sala conductor4 = new Sala();// trasporte a Classe Sala
		Cine conductor5 = new Cine();// trasporte a Classe Cine
		 
		
		
	    
	    Pelicula cartelera []= new Pelicula [3]; // array para guardas Las peliculas 
		Sala cine[] = new Sala[3];// array para guardar las salas
	    Asientos seat [][] = new Asientos[8][9];// array para guardar  los asientos de la sala 1
	    Asientos seat2 [][] = new Asientos[8][9];// array para guardar  los asientos de la sala 2
	    Asientos seat3 [][] = new Asientos[8][9];// array para guardar  los asientos de la sala 3 
	    Espectador[]espectador = new Espectador[216]; // array para guardar los espectadores
	    Cine[] yelmo = new Cine[2];// array para guardar los cines ( En caso de crear mas cines  ) 
	    
	    
	    // menu de inicio con Do while y Switch 
		do {
			System.out.println(" ******   Menu de inicio Cine Maravillas  ******");
			System.out.println("");
			System.out.println("");
			System.out.println(" Opcion 1     Crear pelicula");
			System.out.println(" Opcion 2     listar Cartelera");
			System.out.println(" Opcion 3     Crear  Salas");
			System.out.println(" Opcion 4     Precio Entrada al Cine");
			System.out.println(" opcion 5     Crear Espectador y buscar asiento ");
			System.out.println(" opcion 6     salir");

			System.out.println("Introduzca un opcion Valida");

			opcion = sc.nextInt();

			switch (opcion) {  // seleccion de opciones del menu

			case 1: {

				conductor.carteleraPelis(cartelera);
				// inicia metodo Cartelera pelis para crear peliculas le pasamos 
				//por parametros el Array Cartelera para guardar las peliculas
				

				break;
			}

			case 2: {
				// inicia metodo Listar cartelera, le pasamos el array Cartelera para 
				// imprimir las peliculas en cartelara
				conductor.listarCartelera(cartelera);

				break;
			}
			case 3: {

				
				
				System.out.println("Que sala quiere crear seleccione del 1 al 3 ");
				seleccionsala = sc.nextInt(); 
				// se selecciona la sala a la que hay que añadir una pelicula
				
				if (seleccionsala == 1 || seleccionsala == 2 || seleccionsala == 3)
				{
				
				
				switch (seleccionsala) {
				/*en funcion de la sala seleccionada se inicia el metodo crear sala  se 
				 le envia por parametros  el array de asientos correspondiente a la sala
				 el array de cartelera para elegir la pelicula.el array de salas para guardar la
				 sala creada y la seleccion de sala para que haga de indice
				*/

				case 1: {

					conductor3.crearasientos(seat);
					crearSala = conductor4.crearSalas(cartelera, seat, cine, crearSala,seleccionsala);
					

					

					break;
				  }
				case 2: {

					conductor3.crearasientos(seat2);
					crearSala = conductor4.crearSalas(cartelera, seat2, cine, crearSala,seleccionsala);
					

					System.out.println("Sala 2 Creada Correctamente");

					sc.nextLine();

					break;
				  }

				case 3: {

					conductor3.crearasientos(seat3);
					crearSala = conductor4.crearSalas(cartelera, seat3, cine, crearSala,seleccionsala);
		

					System.out.println("Sala 3 Creada Correctamente");

					sc.nextLine();

					break;
				  }
				default:{
					
					System.out.println(" no existe esa sala ");
				}
				
				
				

				}
				
				}else// si el numero no es del 1 al 3 manda error por pantalla
				{
					
					
					System.out.println("seleccion se sala erronea");
				}

				break;

			}

			case 4: {
				
				// inicia Crear cine , se le pasa el array de Salas para crear el cine el boolean crearsala para saber 
				//si hay alguna sala cerada y el array de cines para guardar el cine creado
				
				conductor5.crearCine(cine, crearSala, yelmo);
			

				break;
			}
			
			case 5: {
				
				  /* arranca Crear Espectadores y el pasa por parametros el array de Espectadores 
				   * para que guarde el Espectador creado y el contador de espectadores para saber 
				   * el aforo, luego arranca Asignarbutacas  y le pasa el objeto espectador creado
				    el array cine para consultar precio el array cartelera para consultar la pelicula 
				   y la edad de visionado y retorna el mcontador de espectadores para el control de aforo */
				
				
				contadorEspectadores= conductor5.asignarButaca(cine, conductor2.crearEspectador(espectador,contadorEspectadores,yelmo), cartelera,yelmo, contadorEspectadores);
			
				
				
				
				
				
				break;
			}
			case 6:
			{
				
				
				System.out.println("");
				
				System.out.println("");
				System.out.println("Hasta Pronto..... Adios!!!");
				
				;
				
				break;
			}

			default: {

				System.out.println(" La opcion elegida no es valida");

			}

			}

		}

		while (opcion != 6);

	}

}
