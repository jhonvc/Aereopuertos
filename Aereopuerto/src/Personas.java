import java.util.ArrayList;
import java.util.List;

public class Personas {
	String nombre;
	String apellido;
	String edad;
	List<Personas> Personaslist= new ArrayList<Personas>();
	
	
	public Personas(String nombre, String edad, String apellido) {
		this.nombre= nombre;
		this.edad= edad;
		this.apellido=apellido;
		
		
		
		
	}
	public Personas() {
		this.nombre="Daniel";
		this.apellido="Casani";
		this.edad="40";
		
				
		
		
	}
	public void imprimir() {
		System.out.println("Personas nombre:"+nombre);
		System.out.println("Personas apellido:"+apellido);
		 System.out.println("Personas edad :"+ edad);
	}
	

}
