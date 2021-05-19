package CrearCine;

//import java.util.Arrays;

public class Asientos {

	private String fila[]={"8","7","6","5","4","3","2","1"}; // array de Filas para autollenado
	private String columna[]={"A","B","C","D","E","F","G","H","I"};// array de columnas para autollenado
	private String sit; // string para recoger las filas y los asientos
	private boolean ocupado = false; // boolean para asignar las butacas vacias
	private Espectador espectador ;// Objeto Espectador vacio para asignar a cada butaca
	
	
	
	
	
	public Asientos() {// constructor vacio
		
	}






	public Asientos(String sit, boolean ocupado ,Espectador espectador) {// constructor con atributos
		
		this.sit = sit;
		this.ocupado = ocupado;
		this.espectador= espectador;
		
	}
	
	// metodo para crear asientos  le pasamos por parametros desde el main
	// array vacio de asientos para que lo llene.
	public void crearasientos(Asientos[][] seat)
	
	{
		
		Espectador espectador = new Espectador();// objeto espectador vacio
		String asiento1;// String para recibir la fila y columna del asiento

		for(int i =0 ; i< fila.length; i++) /* itera los arrays de filas y  columnas 
			
			y lo guarda en asiento1;
			*
			*/
		{
			for (int j = 0; j< columna.length; j++) 
			{
				
			asiento1= fila[i]+ columna[j];
			
			       // guarda asiento 1 junto con el boolean de ocupado y el objeto espectador vacio
			       // en el hueco del array de asientos iterado por i y j
				seat[i][j]= new Asientos(asiento1,this.ocupado,espectador);
				
			}
			
		}
		
		System.out.println(" .......Asignado Asientos a la Sala");
		
		System.out.println("");
		
		
		
	}




	
	// seters y getters necasarios


	public Espectador getEspectador() {
		return espectador;
	}






	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}






	public String[] getFila() {
		return fila;
	}






	public void setFila(String[] fila) {
		this.fila = fila;
	}






	public String[] getColumna() {
		return columna;
	}






	public void setColumna(String[] columna) {
		this.columna = columna;
	}






	public String getSit() {
		return sit;
	}






	public void setSit(String sit) {
		this.sit = sit;
	}






	






	public boolean isOcupado() {
		return ocupado;
	}






	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}






	
	
	
}


