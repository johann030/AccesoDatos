package ejercicio1_B;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainLeerFicheroTeclado {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		String usarFichero;
		String leerLineas;

		try {
			System.out.println("Escriba por teclado 1 de las siguientes opciones para elegir el archivo: ");
			System.out.println("Tarea2/ejercicio1_B/FicheroLeer.txt");
			System.out.println("Tarea2/ejercicio1_B/FicheroLeer1.txt");
			System.out.println("Tarea2/ejercicio1_B/FicheroLeer2.txt");
			usarFichero = sc.nextLine();
			BufferedReader leerFichero = new BufferedReader(new FileReader(usarFichero));			
			while((leerLineas = leerFichero.readLine()) != null) {
				System.out.println(leerLineas);
			}
			
			leerFichero.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}