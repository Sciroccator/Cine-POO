package CrearCine;

import java.util.Scanner;

public class Espectador extends Pelicula {
	
	private String nombre;  // nombre del espectador
	private int edad;  // edad del espectador
	private double dinero; // Dinero del espectador
	Scanner sc= new Scanner(System.in); // recogida de datos
	
	
	
	public Espectador() {// constructor vacio
		
		
		
		
		
	}
	public Espectador(String nombre, int edad, double dinero) { // constructor con atributos
		
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	
	/* Metodo para Crear Espectadores , le llegan por parametros un array de espectadores para guardarlos
	y un contador de espectadores para conprobar que no se ha llegado al aforo maximo*/
	public Espectador crearEspectador(Espectador[]espectador, int contadorEspectadores,Cine[] yelmo)
	{
		
		if (yelmo[0] != null)
		{
		
		
		if (contadorEspectadores < 216)// si no se supera el aforo entra en el if
		{
			
			// recoge datos del espectador
		System.out.println("Introduzca el nombre del espectador ");
		String nombre = sc.next();
		System.out.println("Introduzca la edad del espectador");
		int edad = sc.nextInt();
		System.out.println("Introduzca el dinero disponible del espectador");
		double dinero = sc.nextDouble();
		
		// guarda el objeto Espectador creado en el Array de Espectadores
		espectador[contadorEspectadores]= new Espectador(nombre,edad,dinero);
		System.out.println(" Espectador creado correctamente");
		
		
		
		
		}else// si el Aforo esta completo estra em el else
		{
			System.out.println(" Aforo completo no se admiten mas espectadores");
			System.out.println("");
			
			System.out.println("Pulse Intro para Seguir");

			String pag;
			pag= sc.nextLine();
			
		}
		
		}else
		{
			
		   System.out.println("No hay salas Creadas o no se ha asignado el precio , compruebelo de nuevo ");
		   
		   System.out.println(" pulse Intro para seguir ");
		  
		   String pag = sc.nextLine();
		}
		
		return espectador[contadorEspectadores];
		// retora el espectador creado y guardado en la pocicion del array tomando por indice
		//el contador de espectadores
		
	}
	
	// getter and Setters necesarios
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
	
	
	

}
