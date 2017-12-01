import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase sirve para poder añadir objetos de la clase persona y los
 * atributos que pueda tener
 * @author Jon Jauregi
 *
 */

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
		/*for (int i = 0; i < cuadrilla.length; i++){
			
			do{
				km = (Math.random()*16);
				
			}
			while (km < 5);
			cuadrilla[i].correr(km);	
				
			
				
			cuadrilla[i].setDinero(50);
		}*/
		/*
		System.out.println("Escribe un nombre para una persona:");
		Persona persona1 = new Persona();
		persona1.setNombre(lector.nextLine());
		System.out.println("Escribe los apellidos de " +persona1.getNombre()+":");
		persona1.setApellidos(lector.nextLine());
		System.out.println("Escribe un DNI para " +persona1.getNombre()+":");
		persona1.setDNI(lector.nextLine());
		System.out.println("Define el peso de " +persona1.getNombre()+":");
		persona1.setPeso(Integer.parseInt(lector.nextLine()));
		System.out.println("Define el dinero que tiene " +persona1.getNombre()+":");
		persona1.setDinero(Integer.parseInt(lector.nextLine()));
		
		System.out.println("Información de " +persona1.getNombre()+":");
		System.out.println("Nombre: " +persona1.getNombre());
		System.out.println("Apellidos: " +persona1.getApellidos());
		System.out.println("DNI: "+persona1.getDNI());
		System.out.println("Peso: "+persona1.getPeso());
		System.out.println("Dinero: "+persona1.getDinero());*/
		
		Coche coche = new Coche();
		
		coche.setCombustible(true);
		coche.setLitros_combustible(0);
		coche.setMax_litros(50);
		
		double devolucion = coche.repostar(50);
		
		System.out.println(coche.getLitros_combustible() + " " + devolucion);



	}

}
