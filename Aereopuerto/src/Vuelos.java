import java.util.ArrayList;
import java.util.List;

 public class Vuelos   {
	
	String peso ;
	String hora;
	String avion;
	String piloto;
	String destino;
	List<Vuelos>vueloslist= new  ArrayList<Vuelos>();
	 
	public Vuelos( String peso,String hora,String avion, String piloto, String destino ) {
	this.hora=hora;
	this.avion=avion;
	this.piloto=piloto;
	this.peso=peso;
	this.destino=destino;
	
	
	
	}
	public Vuelos() {
		this.avion="latam";
		this.hora="00.00.00";
		this.piloto="piloto1";
		this.destino="programado";
		
	
			
		
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getAvion() {
		return avion;
	}
	public void setAvion(String avion) {
		this.avion = avion;
	}
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public List<Vuelos> getVueloslist() {
		return vueloslist;
	}
	public void setVueloslist(List<Vuelos> vueloslist) {
		this.vueloslist = vueloslist;
	}
}


