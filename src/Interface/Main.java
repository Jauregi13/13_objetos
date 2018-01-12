package Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int MOSTRAR = 1;
		final int AÑADIR = 2;
		final int SALIR = 3;
		ArrayList<Persona> alumnos = new ArrayList();
		Scanner lector = new Scanner(System.in);
		
		int opcion = 0;
		Persona manu = new Persona("Manuel","Gonzalez");
		manu.setDNI("77634655S");
		alumnos.add(manu);
		Persona jon = new Persona ("Jon", "Jauregi");
		jon.setDNI("54643453Ñ");
		alumnos.add(jon);
		Persona mikel = new Persona ("Mikel", "Paredes");
		mikel.setDNI("46512398D");
		alumnos.add(mikel);
		Persona jokin = new Persona ("Jokin", "Ibarretxe");
		jokin.setDNI("75896324R");
		alumnos.add(jokin);
		Persona aintzane = new Persona ("Aintzane", "Garcia");
		aintzane.setDNI("71264895P");
		alumnos.add(aintzane);
		
		NombreComparator comparador = new NombreComparator();
		
		alumnos.sort(comparador);
		
	
		do {
			System.out.println("-----Registro de alumnos-----");
			System.out.println(MOSTRAR +". Mostrar");
			System.out.println(AÑADIR +". Añadir alumno");
			System.out.println(SALIR +". Salir");
			opcion = Integer.parseInt(lector.nextLine());
			
			switch (opcion) {
			case MOSTRAR:
				mostrarAlumnos(alumnos);
				break;
			
			case AÑADIR:
				
				break;

			default:
				break;
			}
		}
		while(opcion != SALIR);
		
		
		

	}
	
	public static void mostrarAlumnos(ArrayList<Persona> alumnos){
		
		Iterator<Persona> i = alumnos.iterator();
		
		while(i.hasNext()){
			Persona alumno = i.next();
			
			alumno.mostrarPersona();
		}
		
 	}

}
