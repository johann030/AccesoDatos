package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainCrearFicheros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			BufferedWriter crearFichero = new BufferedWriter(new FileWriter("Tarea2/ejercicio2/FicheroLeer.txt"));
			BufferedReader leerFichero = new BufferedReader(new FileReader("Tarea2/ejercicio2/FicheroLeer.txt"));
			String leerLineas;
			String escribirLineas = "";
			System.out.println("Escriba sus notas: ");

			do {
				escribirLineas = sc.nextLine();
				if (!escribirLineas.equalsIgnoreCase("exit")) {
					crearFichero.write(escribirLineas);
					crearFichero.newLine();
				}
			} while (!escribirLineas.equalsIgnoreCase("exit"));

			crearFichero.close();

			System.out.println("RESULTADO:");

			while ((leerLineas = leerFichero.readLine()) != null) {
				System.out.println(leerLineas);
			}
			leerFichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}