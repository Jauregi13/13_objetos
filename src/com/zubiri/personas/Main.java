import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase sirve para poder a�adir objetos de la clase persona y los
 * atributos que pueda tener
 * @author Jon Jauregi
 *
 */

public class Main {
	
	

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D/personas.txt");
		Scanner lector = new Scanner(System.in);
		
		double km = 0;
		/*for (int i = 0; i < cuadrilla.length; i++){
			
			do{
				km = (Math.random()*16);
				
			}
			while (km < 5);
			cuadrilla[i].correr(km);	
				
			
				
			cuadrilla[i].setDinero(50);
		}*/
		
		Coche coche = new Coche();
		
		coche.setLitros_combustible(20);
		
		coche.setMax_litros(50);
		
		coche.setEsGasolina(true);
		
		double devolucion = coche.repostar(10);
		
		System.out.println(coche.getLitros_combustible() + " " + devolucion);
		
		


	}

}
