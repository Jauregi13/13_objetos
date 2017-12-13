package com.zubiri.personas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase sirve para poder añadir objetos de la clase persona y los
 * atributos que pueda tener
 * 
 * @author Jon Jauregi
 *
 */

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		File fichero = new File("D:/personas.txt");
		Scanner lector = new Scanner(fichero);
		Persona[] cuadrilla = new Persona[5];
		int indice = 0;
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] nombre = linea.split(",");
			Persona persona = new Persona(nombre[0], nombre[1]);
			persona.setEdad(Integer.parseInt(nombre[2]));
			persona.setDinero(Integer.parseInt(nombre[3]));
			cuadrilla[indice] = persona;
			indice++;
		}
		System.out.println("Este es el listado de personas:");
		String primerApellido = cuadrilla[0].getApellidos();
		Persona primeraPersona = cuadrilla[0];
		for (int i = 1; i < cuadrilla.length; i++) {
			if (primerApellido.compareTo(cuadrilla[i].getApellidos()) > 0) {
				primerApellido = cuadrilla[i].getApellidos();
				primeraPersona = cuadrilla[i];
			}
			
		}
		System.out.println(primeraPersona.getNombreApellido() + ", " + primeraPersona.getEdad());
		
		//la media de edad de los alumnos
		double media = mediaEdad(cuadrilla);
		System.out.println("La media de edad es:");
		System.out.println(media);
		
		//la suma del dinero de los alumnos
		
		double sumaDinero = sumaDinero(cuadrilla);
		System.out.println("La suma total de dinero de la cuadrilla es:");
		System.out.println(sumaDinero);
		
		double km = 0;
		/*
		 * for (int i = 0; i < cuadrilla.length; i++){
		 * 
		 * do{ km = (Math.random()*16);
		 * 
		 * } while (km < 5); cuadrilla[i].correr(km);
		 * 
		 * 
		 * 
		 * cuadrilla[i].setDinero(50); }
		 */

		/*Coche coche = new Coche();

		coche.setLitros_combustible(20);

		coche.setMax_litros(50);

		coche.setEsGasolina(true);

		double devolucion = coche.repostar(10);

		System.out.println(coche.getLitros_combustible() + " " + devolucion);*/

	}
	
	public static double mediaEdad(Persona[] cuadrilla){
		double media;
		int suma = 0;
		for (int i = 0; i < cuadrilla.length; i++){
			
			suma = suma + cuadrilla[i].getEdad();

		}
		media = (double)suma / cuadrilla.length;
		
		return media;
	}
	
	public static double sumaDinero(Persona[] cuadrilla){
		double sumaDinero = 0;
		for(int i = 0; i < cuadrilla.length; i++){
			sumaDinero = (double)sumaDinero + cuadrilla[i].getDinero();
		}
		return sumaDinero;
	}

}
