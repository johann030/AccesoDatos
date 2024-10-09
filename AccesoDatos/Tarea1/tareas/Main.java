package tareas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Alumno alumno[] = new Alumno[1];
//		ArrayList<Alumno> = new ArrayList<Alumno>();

		for (int i = 0; i < alumno.length; i++) {

			System.out.println("Introduzca la Nia del alumno: ");
			int nia = sc.nextInt();
			sc.nextLine();

			System.out.println("Introduzca el nombre del alumno: ");
			String nombre = sc.nextLine();

			System.out.println("Introduzca los apellidos del alumno: ");
			String apellidos = sc.nextLine();

			System.out.println("Introduzca el genero del alumno: ");
			char genero = sc.nextLine().charAt(0);

			System.out.println("Introduzca la fecha de nacimiento del alumno: ");
//			String fechaEntrada = sc.nextLine();
//			LocalDate nacimiento = LocalDate.parse(fechaEntrada);
			LocalDate nacimiento = null;
//			sc.nextLine();

			System.out.println("Introduzca el cliclo del alumno: ");
			String ciclo = sc.nextLine();

			System.out.println("Introduzca el curso del alumno: ");
			String curso = sc.nextLine();

			System.out.println("Introduzca el grupo del alumno: ");
			String grupo = sc.nextLine();

			alumno[i] = new Alumno(nia, nombre, apellidos, genero, nacimiento, ciclo, curso, grupo);
			
			System.out.println(alumno[i]);
		}
//		for (int j = 0; j < alumno.length; j++) {
//			System.out.println(alumno[j]);
//		}
		sc.close();

	}

}
