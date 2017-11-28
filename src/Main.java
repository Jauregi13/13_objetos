import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lector = new Scanner(System.in);
		
		Persona jon = new Persona();		
		Persona mikel = new Persona();
		Persona pedro = new Persona();
		
		jon.setNombre("Jon");
		mikel.setNombre("Pedro");
		pedro.setNombre("Mikel");
		
		Persona[] cuadrilla = new Persona[4];
		cuadrilla[0] = jon;
		cuadrilla[1] = pedro;
		cuadrilla[2] = mikel;
		cuadrilla[3] = new Persona();
		
		cuadrilla[3].setNombre("Aritz");
		double km = 0;
		for (int i = 0; i < cuadrilla.length; i++){
			
			do{
				km = (Math.random()*16);
				
			}
			while (km < 5);
			cuadrilla[i].correr(km);	
				
			
				
			cuadrilla[i].setDinero(50);
		}

	}

}
