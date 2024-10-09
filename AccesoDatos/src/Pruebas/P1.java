package Pruebas;

import java.util.Scanner;

public class P1 {

	
	private static final int NUMERO_ALUMNOS = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno[] alumnos = new Alumno[NUMERO_ALUMNOS];
		Alumno alumno = new Alumno();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < alumnos.length; i++) {
			System.out.println("Dame tu nombre: ");
			alumno.setNombre(sc.nextLine());
			alumnos[i] = alumno;
		}
		for(int i = 0; i < alumnos.length ; i++) {
			
		}
				

		sc.close();
	}

}
