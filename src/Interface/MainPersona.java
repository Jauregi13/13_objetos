package Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		final int MOSTRAR = 1;
		final int AÑADIR = 2;
		final int SALIR = 3;
		ArrayList<Persona> alumnos = new ArrayList();
		Scanner lector = new Scanner(System.in);
		
		int opcion = 0;
		Persona manu = new Persona("Manuel","Gonzalez");
		manu.setDNI("77634655S");
		manu.setEdad(18);
		alumnos.add(manu);
		Persona jon = new Persona ("Jon", "Jauregi");
		jon.setDNI("54643453Ñ");
		jon.setEdad(21);
		alumnos.add(jon);
		Persona mikel = new Persona ("Mikel", "Paredes");
		mikel.setDNI("46512398D");
		mikel.setEdad(16);
		alumnos.add(mikel);
		Persona jokin = new Persona ("Jokin", "Ibarretxe");
		jokin.setDNI("75896324R");
		jokin.setEdad(25);
		alumnos.add(jokin);
		Persona aintzane = new Persona ("Aintzane", "Garcia");
		aintzane.setDNI("71264895P");
		aintzane.setEdad(21);
		alumnos.add(aintzane);
		
		EdadComparator comparador = new EdadComparator();
		
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
			
			case SALIR:
				
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
