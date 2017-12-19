package Festival;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		final int LISTAR = 1;
		final int AÑADIR = 2;
		final int MODIFICAR = 3;
		final int ELIMINAR = 4;
		final int SALIR = 5;
		
		Festival jazzaldia = new Festival();
		jazzaldia.setNombre("Jazzaldia");
		jazzaldia.setPatrocinador("Heineken");
		File fichero = new File ("D:/actuaciones.txt");
		Scanner scan = new Scanner(fichero);
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		do{
			jazzaldia.mostrarInfo();
			System.out.println("----------MENU----------");
			System.out.println(LISTAR+". Listar las actuaciones de " +jazzaldia.getNombre());
			System.out.println(AÑADIR+". Añadir actuacion a " +jazzaldia.getNombre());
			System.out.println(MODIFICAR+". Modificar la duración de una actuación de " +jazzaldia.getNombre());
			System.out.println(ELIMINAR+". Eliminar una actuación de " +jazzaldia.getNombre());
			opcion = lector.nextInt();
			
			switch(opcion){
			case LISTAR:
				break;
			
			case AÑADIR:
				break;
			
			case MODIFICAR:
				break;
			
			case ELIMINAR:
				break;
			
			case SALIR:
				break;
			
			default:
			}
		}
		
		while(opcion != SALIR);
	}

}
