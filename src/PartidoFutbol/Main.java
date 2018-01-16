package PartidoFutbol;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		final int LISTAR_PARTIDO = 1;
		final int ORDENAR_PARTIDO = 2;
		final int AÑADIR_PARTIDO = 3;
		final int MODIFICAR_PARTIDO = 4;
		final int ELIMINAR_PARTIDO = 5;
		final int SALIR = 6;
		File fichero = new File("D:/partidos.txt");
		Scanner scan = new Scanner(fichero);
		ArrayList<PartidoFutbol> partidos = new ArrayList();
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		
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
		GolesComparator comparador = new GolesComparator();
		
		partidos.sort(comparador);
		do {
			
			System.out.println("----- MENU ------");
			System.out.println(LISTAR_PARTIDO + ". Listar todos los partidos");
			System.out.println(ORDENAR_PARTIDO + ". Ordenar los partidos por goles");
			System.out.println(AÑADIR_PARTIDO + ". Añadir un partido");
			System.out.println(MODIFICAR_PARTIDO + ". Modificar un partido");
			System.out.println(ELIMINAR_PARTIDO + ". Eliminar un partido");
			System.out.println(SALIR + ". Fin del programa");
			
			opcion = Integer.parseInt(lector.nextLine());
			
			
			switch (opcion) {
			case LISTAR_PARTIDO:
				listar_partido(partidos);
				break;
			
			case ORDENAR_PARTIDO:
				ordenar_partido(partidos);
				break;
				
			case MODIFICAR_PARTIDO:
				
				break;
			
			case ELIMINAR_PARTIDO:
				
				break;
			
			case SALIR:
				
				break;

			default:
				break;
			}
			
		}
		
		while(opcion != SALIR);
		
		
		
		
		
		
		

	}
	//recorrer la lista de partidos
	public static void listar_partido(ArrayList<PartidoFutbol> partidos){
		Iterator<PartidoFutbol> i = partidos.iterator();
		System.out.println("------Jornada 18------\n");
		
		while(i.hasNext()){
			PartidoFutbol partido = i.next();
			partido.mostrarInfo();
		}
	}
	
	public static void ordenar_partido(ArrayList<PartidoFutbol> partidos){
		Iterator<PartidoFutbol> iterator = partidos.iterator();
		GolesComparator comparador = new GolesComparator();
		partidos.sort(comparador);
		
		while(iterator.hasNext()){
			PartidoFutbol partido = iterator.next();
			partido.mostrarInfo();
		}

		
	}

}
