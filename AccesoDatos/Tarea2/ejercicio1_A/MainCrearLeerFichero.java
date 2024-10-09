package ejercicio1_A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainCrearLeerFichero {

	public static void main(String[] args) {
		try {
			BufferedWriter crearFichero = new BufferedWriter(new FileWriter("Tarea2/ejercicio1_A/FicheroLeer.txt", true));
			BufferedReader leerFichero = new BufferedReader(new FileReader("Tarea2/ejercicio1_A/FicheroLeer.txt"));
			String lineas;

			while ((lineas = leerFichero.readLine()) != null) {
				System.out.println(lineas);
			}

			leerFichero.close();
			crearFichero.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}