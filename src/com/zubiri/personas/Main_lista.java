package com.zubiri.personas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main_lista {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		final String NOMBRE_FICHERO = "D:/personas.txt";

		// rellenar la lista desde fichero
		personas = crearLista(NOMBRE_FICHERO);

		final int INSERTAR = 1;
		final int LISTAR = 2;
		final int SALIR = 0;
		final int ELIMINAR = 3;

		Scanner scan = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("--Menu--");
			System.out.println(INSERTAR + " insertar persona");
			System.out.println(LISTAR + " listar");
			System.out.println(ELIMINAR + " eliminar");
			System.out.println(SALIR + " salir");

			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case INSERTAR:
				// pedir datos de pesona
				System.out.println("Introduce el Nombre");
				String nombre = scan.nextLine();

				System.out.println("Introduce el Apellido");
				String apellido = scan.nextLine();

				System.out.println("Introduce el telefono");
				String telf = scan.nextLine();
				
				System.out.println("Introduce el DNI:");
				String DNI = scan.nextLine();

				// crear persona
				Persona persona = new Persona();
				persona.setNombre(nombre);
				persona.setApellidos(apellido);
				persona.setTelefono(telf);

				// aniadirlo a la lista
				personas.add(persona);

				break;
			case LISTAR:
				if (personas.isEmpty()) {
					System.out.println("La lista esta vacía");
				} else {
					Iterator<Persona> i = personas.iterator();
					while (i.hasNext()) {
						Persona p = i.next();
						p.mostrarPersona();
					}
				}

				break;
			
			case ELIMINAR:
				System.out.println("Introduce un DNI para eliminar la persona");
				DNI = scan.nextLine();
				
				eliminarPersona(DNI,personas);
				break;
			case SALIR:

				guardarLista(personas, NOMBRE_FICHERO);

				System.out.println("Guardado y Saliendo.....");
				break;

			default:
				System.out.println("Opcion mal");
				break;
			}

		} while (opcion != SALIR);

	}

	private static void eliminarPersona(String DNI, ArrayList<Persona> personas) {
		Iterator<Persona> i = personas.iterator();
		while(i.hasNext()){
			Persona p = i.next();
			if(p.getDNI().equals(DNI)){
				i.remove();
				System.out.println(p.getNombre() +" eliminado");
			}
		}
	}

	private static ArrayList<Persona> crearLista(String nombreFichero) {
		ArrayList<Persona> lista = new ArrayList<Persona>();

		File file = new File(nombreFichero);
		Scanner scan = null;
		try {
			scan = new Scanner(file);

			// por cada linea del texto añade una persona a la lista
			while (scan.hasNext()) {
				String linea = scan.nextLine();
				String[] partes = linea.split(",");

				Persona p = new Persona();
				p.setNombre(partes[0]);
				p.setApellidos(partes[1]);
				p.setTelefono(partes[2]);
				p.setDNI(partes[3]);

				lista.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return lista;
	}

	private static void guardarLista(ArrayList<Persona> personas, String nombreFichero) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(nombreFichero);

			PrintWriter printWriter = new PrintWriter(fileWriter);

			Iterator<Persona> it = personas.iterator();
			while (it.hasNext()) {
				Persona persona = it.next();
				printWriter.println(persona.getStringGuardado());

			}
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
