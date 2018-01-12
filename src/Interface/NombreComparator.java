package Interface;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona> {

	public int compare(Persona arg0, Persona arg1) {
		
		return arg0.getApellidos().compareTo(arg1.getApellidos());	
	}
	
	

}
