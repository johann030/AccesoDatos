package tareas;

import java.time.LocalDate;

public class Alumno {
	private int nia;
	private String nombre, apellidos, ciclo, curso;
	private char genero;
	private LocalDate nacimiento;

	public Alumno(int nia, String nombre, String apellidos, char genero, LocalDate nacimiento, String ciclo, String curso, String grupo) {
		this.nia = nia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.nacimiento = nacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
	}
	
//	public Alumno(int nia, String nombre, String apellidos, char genero, String ciclo, String curso, String grupo) {
//		this.nia = nia;
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.genero = genero;
//		this.ciclo = ciclo;
//		this.curso = curso;
//	}

	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciclo=" + ciclo
				+ ", curso=" + curso + ", genero=" + genero + ", nacimiento=" + nacimiento + "]";
	}

}
