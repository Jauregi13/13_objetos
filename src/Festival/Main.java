package Festival;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
		final String NOMBREFICHERO = "C:/Users/Jon Jauregi/Documents/Ejercicios eclipse/13_objetos/src/Festival/actuaciones.txt";
		Festival jazzaldia = new Festival();
		ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		jazzaldia.setActuaciones(actuaciones);
		jazzaldia.setNombre("Jazzaldia");
		jazzaldia.setPatrocinador("Heineken");
		File fichero = new File (NOMBREFICHERO);
		Scanner scan = new Scanner(fichero);
		Scanner lector = new Scanner(System.in);
		int opcion = 0;
		do{
			jazzaldia.mostrarInfo();
			crearLista(fichero,scan,actuaciones);
			System.out.println("----------MENU----------");
			System.out.println(LISTAR+". Listar las actuaciones de " +jazzaldia.getNombre());
			System.out.println(AÑADIR+". Añadir actuacion a " +jazzaldia.getNombre());
			System.out.println(MODIFICAR+". Modificar la duración de una actuación de " +jazzaldia.getNombre());
			System.out.println(ELIMINAR+". Eliminar una actuación de " +jazzaldia.getNombre());
			System.out.println(SALIR+". Fin del programa");
			opcion = Integer.parseInt(lector.nextLine());
			
			switch(opcion){
			case LISTAR:
				Iterator<Actuacion> i = actuaciones.iterator();
				while(i.hasNext()){
					Actuacion a = i.next();
					System.out.println(a.getInfo());
				}
				break;
			
			case AÑADIR:
				System.out.println("Introduce el nombre del grupo:");
				String nombre_grupo = lector.nextLine();
				
				System.out.println("Introduce la duracion de la actuación");
				int duracion = Integer.parseInt(lector.nextLine());
				
				jazzaldia.addActuacion(nombre_grupo,duracion);
				break;
			
			case MODIFICAR:
				System.out.println("Introduce el nombre del grupo a modificar:");
				String nombregrupo = lector.nextLine();
				System.out.println("Introduce la duracion nueva de la actuacion:");
				int duracionNueva = Integer.parseInt(lector.nextLine());
				
				jazzaldia.cambiarDuracionActuacion(nombregrupo, duracionNueva);
				break;
			
			case ELIMINAR:
				System.out.println("Introduce el nombre del grupo de la actuacion a eliminar:");
				String grupoEliminar = lector.nextLine();
				
				jazzaldia.eliminarActuacion(grupoEliminar);
				break;
			
			case SALIR:
				guardarLista(NOMBREFICHERO,actuaciones);
				break;
			
			default:
			}
		}
		
		while(opcion != SALIR);
	}
	
	
	
	public static void crearLista(File fichero, Scanner scan, ArrayList<Actuacion> actuaciones){
		while (scan.hasNextLine()){
			String linea = scan.nextLine();
			String[] partes = linea.split(" : ");
			Actuacion a = new Actuacion();
			a.setNombreGrupo(partes[0]);
			a.setDuracion(Integer.parseInt(partes[1]));
			actuaciones.add(a);
		}
	}
	
	public static void guardarLista (String nombreFichero, ArrayList<Actuacion> actuaciones){
		
		try {
			FileWriter filewriter = new FileWriter(nombreFichero);
			
			PrintWriter printwriter = new PrintWriter(filewriter);
			
			Iterator<Actuacion> i = actuaciones.iterator();
			
			while(i.hasNext()){
				Actuacion a = i.next();
				
				printwriter.println(a.getInfo());
			}
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
