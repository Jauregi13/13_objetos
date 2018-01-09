package PartidoFutbol;

public class PartidoFutbol {
	
	private String visitante;
	private String local;
	private int goles_local;
	private int goles_visitante;
	
	
	
	
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getGoles_local() {
		return goles_local;
	}
	public void setGoles_local(int goles_local) {
		this.goles_local = goles_local;
	}
	public int getGoles_visitante() {
		return goles_visitante;
	}
	public void setGoles_visitante(int goles_visitante) {
		this.goles_visitante = goles_visitante;
	}
	
	public void mostrarInfo(){
		System.out.println(getLocal() +" "+ getGoles_local() + " - " + getGoles_visitante() + " " + getVisitante());
	}
	
	

}
