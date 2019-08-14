import java.util.ArrayList;
import java.util.List;

public class Aereopuerto {
	String nombre;
	String ciudad;
	String vuelos;
	
	 List<Aereopuerto> aereopuertolist = new ArrayList<Aereopuerto>();
	 
	 public Aereopuerto(String nombre, String ciudad, String vuelos) {
		 this.nombre=nombre;
		 this.ciudad=ciudad;
		 this.vuelos=vuelos;
		 
				 	 
	 }
	 public void Personas() {
		 this.nombre="Rodriguez Ballon";
		 this.ciudad="Arequipa";
		 this.vuelos="programados";
		 
	 }
	 
	
	 public String getVuelos() {
			return vuelos;
		}
	public void imprimir() {
		System.out.println("Aereopuerto nombre :"+nombre);
		System.out.println("Aereopuerto ciudad :"+ciudad);
		System.out.println("Aereopuerto vuelos :"+ vuelos);
		
		
		
	}


	
}
