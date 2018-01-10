package Interface;

public class Actuacion implements Mostrador {
	
	private String nombreGrupo;
	private int duracion;
	
	
	
	

	
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void mostrar(){
		System.out.println(this.getNombreGrupo() + " : " + this.getDuracion());
	}
	
	public String getInfo(){
		return this.getNombreGrupo() + " : " + this.getDuracion();
	}
	
	

}
