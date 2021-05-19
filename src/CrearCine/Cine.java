package CrearCine;

import java.util.Scanner;

public class Cine {
	
	
	// atributos Cine
	
	private double precio; // precio entrada
    private Sala cine[] = new Sala[3]; // objeto Tipo Sala 
    
    


    Scanner sc = new Scanner(System.in); // Scanner recogida dados

	
	
	
	
	
	public Cine() {  // constructos vacio
		
		
		
	}
	
	
	
	public Cine(double precio, Sala[] cine ) { // constructor con Atributos
		
		this.precio = precio;
		this.cine =cine;
	}
	
	
	
	// Metodo Crear Objeto Cine se le pasa por parametros array de salas, boolean para saber si hay salas creadas y array de Cine para almacenar el cine creado
	public void crearCine ( Sala[]cine,boolean crearSala,Cine[]yelmo )  
	{
		
    
		
		
		
		if(crearSala)
			
		{
			// recoge el precio del cine
			// crea un objeto Cine con el precio asignado;
			System.out.println("introduzca el Precio de una entrada");
			int precio = sc.nextInt();
			yelmo[0] = new Cine(precio,cine);
			System.out.println("");
			System.out.println("");

			System.out.println("Precio Guardado ");
			System.out.println("");
			System.out.println("Pulse Intro para seguir");
			sc.nextLine();
			String pag= sc.nextLine();
			
			
		}else
		{
			// si no esta creada ninguna sala te avisa y no crea el cine
			
			System.out.println(" No estan creadas las salas, Cree almenos una sala antes ");
			
			
			System.out.println("");
			
			System.out.println("Pulse Intro para Seguir");

			String pag;
			pag= sc.nextLine();
		}
		
		
		
		
	}
	
	// metodo para asignar butaca al Espectador y cobrarle, comprueba que tiene dinero suficiente y la edad necesaria para ver la pelicula
	public int  asignarButaca(Sala[]cine,Espectador espectador,Pelicula[]cartelera,Cine[] yelmo, int contadorEspectadores)
	
	
	// le pasamos por parametros un array de salas , un objeto espectador, un array de peliculas , un array de cines y el contador de espectadores para el aforo
	{
		
		
		if(yelmo[0] != null)// comprueba que esta creado el Cine que contiene las salas y el precio
		{
		
		String pag; // paso de pagina
		int sala=0; // numero de sala
		double precioentrada;// para guardar el precio de la entrada
		double dinero;   //guarda el dinero disponible del Espectador
	    int edad; //guarda la edad del espectador
	    boolean sentado ; //false; boolean para sentar al espectador en la sala
	    
	    
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Estas son las Salas de Emision disponibles");
		
		
		System.out.println("");
		System.out.println("");

		
		for(int i = 0; i< cine.length; i++)// for para mostrar las salas de Emision 
		{
			
		
		
			if (cine[i] != null)  // comprueba si la sala existe
			{
				
				 System.out.println(" Sala Numero " + cine[i].getNumbsala()+" Titulo "+ cine[i].getPeli().getTitulo()+" Edad Minima"+ cine[i].getPeli().getEdadMin());
				
			
			}else
			{
				
				System.out.println(" Sala No creada" );
				
				

				
				
			}
				
		
		}
		
		
		 System.out.println("");
		 System.out.println("");

		
	    System.out.println("Elija una Sala "); // eleccion de sala porparte del usuario
		 System.out.println("");
		 System.out.println("");

	    
		sala = sc.nextInt();   // guarda la seleccion de sala
		precioentrada = yelmo[0].getPrecio();
		dinero= espectador.getDinero();
		edad = espectador.getEdad();
		
		
		    if( yelmo[0].getCine()[sala-1] == null)// si la sala no existe entra en el if
		    {
		    	System.out.println(" La Sala no Existe ");
		    	
		    	
		    	System.out.println("");
				
				System.out.println("Pulse Intro para Seguir");

				sc.nextLine();
				pag= sc.nextLine();
		    	
		    }else {  // si la sala existe entra en el Else
		
		
		int edadmin = yelmo[0].getCine()[sala-1].getPeli().getEdadMin();// obtiene la edad minima de la pelicula
		 
		 
		if (edad > edadmin) // compara si la edad del Espectador es mayor que la de visionado 
		{
			
		 if (dinero > precioentrada) // compara si tiene dinero suficiente para pagar la entrada
		 {
			 System.out.println("Precio Entrada " + precioentrada + " euros dispone de " + dinero + "euros");
			 System.out.println("");

			 System.out.println(" Le sobran "+(dinero - precioentrada));
			 
			 System.out.println("");
			 System.out.println("");
			 System.out.println("");
		    contadorEspectadores ++;

			 
			System.out.println("Pulse Intro para buscar un asiento libre");  // si cumple todo le busca asiento en la sala 
			sc.nextLine();
			pag = sc.nextLine();
			
			
			if(cine[sala-1]!= null)
			{
				

			for(int i = 0  ; i<8  ; i++ )
			{
				
				for(int j = 0  ; j< 9; j++ )
				{
					int indice = (sala-1);  // entra dentro de la sala y va buscando un Asiento libre
					sentado =  yelmo[0].getCine()[indice].getAsientos()[i][j].isOcupado();
					if (sentado == false) // si Sentado es falso es que la plaza esta libre 
					{
						 yelmo[0].getCine()[indice].getAsientos()[i][j].setOcupado(true); //Cambia ocupado a true para que la proxima vez que entre el for aparezca como plaza ocupada
						 yelmo[0].getCine()[indice].getAsientos()[i][j].setEspectador(espectador);// cambia el objeto espectador que esta vacio por el que hemos creado anteriormente ya con datos 
						
						System.out.println("Le hemos encontrado un asiento libre la butaca " + yelmo[0].getCine()[indice].getAsientos()[i][j].getSit()+ 
								" Pelicula " + yelmo[0].getCine()[indice].getPeli().getTitulo()+ " Sala "+ yelmo[0].cine[indice].getNumbsala()) ;
						yelmo[0].getCine()[indice].getAsientos()[i][j].setOcupado(true);
						i=7;
						j=8;
					}
					
					
				}
				
				
				
			}
			
			
			 System.out.println("");
			 System.out.println("");
            System.out.println(" Espectador numero "+ contadorEspectadores ); // informa del numero de espectador
            System.out.println("");
			System.out.println(" Tome nota de la butaca y Pulse Intro  para seguir"); 
		

			pag = sc.nextLine();
			}else  // si la sala esta vacia  entra en el else y le informa 
			{
				System.out.println("La sala esta Vacia no proyecta ninguna Pelicula ");
				System.out.println(" Vuelva a intentarlo");
				
				System.out.println("");
				
				System.out.println("Pulse intro para seguir");
				
				pag = sc.nextLine();

			}
			
			
			
			 
			 
		 }else// si el dinero no es suficiente entra en el Else y le informa
		 {
			 System.out.println("");

			 System.out.println(" Dispone de " + dinero + " euros , no es suficiente para comprar una entrada ");
			 System.out.println("");
			 System.out.println("");
				
				System.out.println("Pulse Intro para Seguir");
				sc.nextLine();

				
				pag= sc.nextLine();
			 
		 }
		}else // si la edad no es la adecuada entra en el Else y  le informa
		{
			
		System.out.println("Lo siento no tiene la edad minima para ver la Pelicula");	
		
		System.out.println("");
		
		System.out.println("Pulse Intro para Seguir");

		sc.nextLine();
		pag= sc.nextLine();

			
			
		}
		 
		    }
		
		} else// si no esta creado el Cine manda un mensaje para revisar las salas
		{
			
			System.out.println("compruebe que las salas estan creadas");
			
			System.out.println("Pulse Intro para seguir ");
			
			
			
			String pag = sc.nextLine();
			
			
			
		}
		
		
		    
		    return contadorEspectadores; //retorna el contador de espectadores a el Principal 
	}

	// Setter and Getters Necesarios 

	public Sala[] getCine() {
		return cine;
	}



	public void setCine(Sala[] cine) {
		this.cine = cine;
	}






	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
