package Polimorfismo;

import java.util.Scanner;

public class Recta extends Figura1D{
	
	Scanner lector = new Scanner(System.in);
	
	public void borra(){
		System.out.println("Se ha borrado la recta");
	}
	
	public void dibuja(){
		System.out.println("Escribe la primera coordenada del primer punto:");
		super.setX0(lector.nextInt());
		System.out.println("Escribe la segunda coordenada del primer punto:");
		super.setY0(lector.nextInt());
		System.out.println("Escribe la primera coordenada del segundo punto:");
		super.setX1(lector.nextInt());
		System.out.println("Escribe la segunda coordenada del segundo punto:");
		super.setY1(lector.nextInt());
	
		if(super.getY0() > super.getY1()){
			
		}



	}

}
