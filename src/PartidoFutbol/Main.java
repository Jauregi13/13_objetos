package PartidoFutbol;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		final int LISTAR_PARTIDO = 1;
		final int AÑADIR_PARTIDO = 2;
		final int MODIFICAR_PARTIDO = 3;
		final int ELIMINAR_PARTIDO = 4;
		final int SALIR = 5;
		File fichero = new File("D:/partidos.txt");
		Scanner scan = new Scanner(fichero);
		ArrayList<PartidoFutbol> partidos = new ArrayList();
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		do {
			
			System.out.println("----- MENU ------");
			System.out.println(LISTAR_PARTIDO + ". Listar todos los partidos");
			System.out.println(AÑADIR_PARTIDO + ". Añadir un partido");
			System.out.println(MODIFICAR_PARTIDO + ". Modificar un partido");
			System.out.println(ELIMINAR_PARTIDO + ". Eliminar un partido");
			System.out.println(SALIR + ". Fin del programa");
			
			opcion = Integer.parseInt(lector.nextLine());
			
		}
		
		while(opcion != SALIR);
		
		while(scan.hasNextLine()){
			PartidoFutbol partido = new PartidoFutbol();
			String linea = scan.nextLine();
			String[] partes = linea.split(":");
			partido.setLocal(partes[0]);
			partido.setVisitante(partes[1]);
			partido.setGoles_local(Integer.parseInt(partes[2]));
			partido.setGoles_visitante(Integer.parseInt(partes[3]));
			partidos.add(partido);
		}
		
		//recorrer la lista de partidos
		
		Iterator<PartidoFutbol> i = partidos.iterator();
		
		System.out.println("------Jornada 18------\n");
		
		while(i.hasNext()){
			PartidoFutbol partido = i.next();
			partido.mostrarInfo();
		}

	}

}
