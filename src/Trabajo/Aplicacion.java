package Trabajo;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Tripulante> barco1 = new ArrayList<>();
		
		//objetos 
		Barco barco = new Barco("titanic", "carguero", 300, 500);
		Gps gps = new Gps ("2", "3", "3-03-2023", "3:00", 3);
		Capitan capitan = new Capitan(0, 0, 0, null, null, (char) 0, 0, 0, 0, 0);
		Jefedeflota jefe = new Jefedeflota(0, 0, 0, null, null, (char) 0, 0, 0, 0, 0, 0, 0);
		
		for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el nombre del tripulante:");
            capitan.setNombre(entrada.nextLine());
            System.out.println("ingrese la edad: ");
            capitan.setEdad(entrada.nextInt());
            System.out.println("ingrese los años de experiencia: ");
            capitan.setTiempoe(entrada.nextInt());
            System.out.println("ingrese el telefono: ");
            capitan.setTelefono(entrada.nextLine());
            barco1.add(capitan);
        }
		for (Tripulante tripulante : barco1) {
            tripulante.mostrardatos();
        }
	}
}
