package CrearCine;

//import java.util.Arrays;
import java.util.Scanner;

public class Sala {
	
	private Asientos asientos[][] = new Asientos[8][9]; // Array de objetos Asientos
	private Pelicula peli;// objeto de tipo pelicula
	private int numbsala; // int con el numero de la sala
	
	
	
	
	
	public Sala() {// constructor vacio
	
	}

	public Sala(Asientos[][] asientos, Pelicula peli,int numbsala)
	// constructor con Atributos
	{
	
		this.asientos = asientos;
		this.peli = peli;
		this.numbsala= numbsala;
		
	}
	
	/* metodo para crear Salas , se le pasa por parametros array de Peliculas para elegir la 
	pelicula para meter en la sala , Array de asientos para crear las butacas,array sala para guardarla sala creada 
	boolean para informar si hay alguna sala creada y que se retorna con return para informar ya hay una sala creada almenos
	y un entero con el numero de sala seleccionado en el MEnu principal del main
	
	*/
	
	
	public boolean crearSalas(Pelicula[]cartelera,Asientos[][] asientos,Sala cine[],boolean crearSala ,int seleccionsala)
	{
	  
		
		
		Scanner sc = new Scanner(System.in);
		int seleccion ;
		for(int i = 0; i< cartelera.length; i++)// iteramos Cartelera para saber las peliculas creadas
		{
			
		
		
			if (cartelera[i] != null) // si hay pelculas las sacamos por pantalla
			{
				
				 System.out.println(" Pelicula numero " + (i+1) +" titulo "+ cartelera[i].getTitulo());
				
			
			}else
			{
				 // si no hay pelicula creada mandamos aviso
				System.out.println("Pelicula " +(i+1) +" no creada");
			}
				
		
		}
		
		System.out.println(" Elija una pelicula para la sala "+ seleccionsala);
		// seleccionamos una pelcula
		
		seleccion = sc.nextInt();
		
		// se añade la pelicula a la sala eleccionada en el Main
		
		if (cartelera[seleccion-1] != null)
		{
		
		cine[seleccionsala-1]= new Sala (asientos,cartelera[seleccionsala-1],seleccionsala);
        
		
		System.out.println("Sala Creada Correctamente ");
		
		
		System.out.println("");
		
		System.out.println("Pulse Intro para Seguir");

		
		sc.nextLine();
		
		String pag;
		pag= sc.nextLine();
		//Se retorna El boolea avisando que ya hay creada una sala , por lo cual ya se puede crear un cine
		crearSala = true;
		}else
		{
			
			System.out.println(" Esta Pelicula no esta creada");
			
			System.out.println("Pulse Intro para Seguir");
			
			
			sc.nextLine();
			String pag = sc.nextLine();
			
			
		}
		
		return crearSala;
		
		
	}

	
           // setter and getters necesarios
	
	public int getNumbsala() {
		return numbsala;
	}

	public void setNumbsala(int numbsala) {
		this.numbsala = numbsala;
	}





	public Pelicula getPeli() {
		return peli;
	}

	public Asientos[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asientos[][] asientos) {
		this.asientos = asientos;
	}

	

	

	

	public void setPeli(Pelicula peli) {
		this.peli = peli;
	}

	
	
	
	

}


