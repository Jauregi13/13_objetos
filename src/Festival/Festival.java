package Festival;
import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	
	private String nombre;
	private String patrocinador;
	private ArrayList<Actuacion> actuaciones;
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	
	
	public void addActuacion(Actuacion a){
		this.actuaciones.add(a);
	}
	
	public void addActuacion(String nombre, int duracion){
		
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		this.actuaciones.add(a);
	}
	
	public void mostrarInfo(){
		System.out.println(getNombre());
		System.out.println("Patrocinado por " + getPatrocinador());
		//System.out.println(this.duracionTotalFestival() + " minutos de musica!!");
		System.out.println("----------------");
		/*Iterator<Actuacion> i = actuaciones.iterator();
		
		while (i.hasNext()){ 
			System.out.println(i.next().getInfo());
		}*/
	}
	
	
	public void eliminarActuacion(String grupo){
		Iterator<Actuacion> i = actuaciones.iterator();
		
		while(i.hasNext()){
			Actuacion a = i.next();
			if (a.getNombreGrupo().equals(grupo)){
				i.remove();
			}
		}
	}
	
	
	
	
	public void cambiarDuracionActuacion(String nombre_grupo, int duracion){
		for(int i = 0; i < this.actuaciones.size(); i++){
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombre_grupo)){
				Actuacion a = this.actuaciones.get(i);
				a.setDuracion(duracion);
				this.actuaciones.set(i, a);
			}
		}
	}
	
	
	public int duracionTotalFestival(){
		int duracion_total = 0;
		for (int i = 0; i < actuaciones.size(); i++){
			duracion_total = duracion_total + actuaciones.get(i).getDuracion();
		}
		return duracion_total;
	}
	
	
	

}
