package es.studium.spring;

/**
 * Clase Asignaturas, tiene la informacion de las asignaturas
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Asignaturas {
	private int codAsignatura;
	private String asignatura;
/**
 * Constructor sin parámetros
 */
	public Asignaturas() {
		codAsignatura=0;
		asignatura="";
	}
	/**
	 * Constructor con parámetros
	 * @param codAsignatura código de la asignatura
	 * @param asignatura nombre de la asignatura
	 */
	public Asignaturas(int codAsignatura, String asignatura) {
		this.codAsignatura=codAsignatura;
		this.asignatura=asignatura;
	}
	/**
	 * Optener código de la asignatura
	 * @return the codAsignatura
	 */
	public int getCodAsignatura() {
		return codAsignatura;
	}
	/**
	 * Establecer código de la asignatura
	 * @param codAsignatura the codAsignatura to set
	 */
	public void setCodAsignatura(int codAsignatura) {
		this.codAsignatura = codAsignatura;
	}
	/**
	 * Optener nombre de la asignatura
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}
	/**
	 * Establecer nombre de la asignatura
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}