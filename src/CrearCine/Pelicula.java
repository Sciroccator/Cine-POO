package CrearCine;

import java.util.Scanner;

public class Pelicula  {
	private String titulo;// titulo pelicula
	private int duracion;// duracion de la pelicula
	private int edadMin; // edad de visionado minima
	private String director;// director pelicula
	private Scanner sc = new Scanner(System.in); // recogida de datos
	 int contadorpeli= 0;// contador de peliculas
	
	
	public Pelicula() {
	
	}


	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	
		
	}

	
	
	
	
	public void carteleraPelis(Pelicula[]cartelera)
	{
		if (contadorpeli <3) // entra en el if si el contador de pelis es inferior a 3
		{
		
		String pag ="";
		
	

		
		System.out.println(" La cartelera se Compone de 3 peliculas y 3 salas.");
		System.out.println("Introduzca los datos de la pelicula ");
		
		
		
	    System.out.println(" pulse una tecla para seguir");
				
		pag= sc.nextLine();
		
		System.out.println(" Introduce el nombre de la pelicula");
		String nombre = sc.nextLine();
		System.out.println(" Introduce la duracion de la pelicula");
		int duracion= sc.nextInt();
		System.out.println(" introduce la edad de visionado");
		int edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca el nombre del director");
		String director= sc.nextLine();
		
		
		 
		// guarda el objeto pelicula en el array cartelera 
		 cartelera[contadorpeli]= new Pelicula (nombre,duracion,edad,director);
		 
		
		
		 
		 System.out.println(" Pelicula creada correctamente"); 
		 
		
		
		 contadorpeli++; // aumenta el cointador de pelis
	
		 System.out.println(" pulse para seguir");
		 sc.nextLine();
		
		}
		else { // si el contador de pelis es superior a 3 entra en el else
			
			System.out.println(" Cartelera completa no se admiten mas Peliculas ");
			
			
		}
		
	}

	
	
	
	

	public void listarCartelera(Pelicula[]cartelera)
	
	// metodo para listar la Cartelera de peliculas 
	{
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		for (int i =0; i< cartelera.length; i++)// Itera el array de cartelera y imprime el To String de cada pelicula
		{
			if (cartelera[i]!= null)
			{
			System.out.println(cartelera[i].toString());
			System.out.println();
			}
			else
			{
				System.out.println("Sala vacia"); //Si el hueco del array esta vacio lo avisa
			}
		}
		System.out.println("");
		System.out.println("");

		System.out.println(" Pulse Intro para Seguir ");
		
		String pag = sc.nextLine();
	}


	
	
	// getter y setter necesarios
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getEdadMin() {
		return edadMin;
	}


	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", duracion=" + duracion + ", edadMin=" + edadMin + ", director="
				+ director + "]";
	}
	
	
	
	
	


	


	
	
	
	
	
	
	

}
