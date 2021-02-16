package es.studium.spring;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase Centros, tiene la información de los centros
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Centros {
	private int codCentro;
	private String nombreCentro;
	private String direccionCentro;
	private List<Alumnos> alumnoCentro;
	/**
	 * Constructor por defecto
	 */
	public Centros() {
		codCentro=0;
		nombreCentro="";
		direccionCentro="";
		alumnoCentro=new ArrayList<Alumnos>();
	}
	/**
	 * Constructor con parámetros
	 * @param codCentro Código del centro
	 * @param nombreCentro Nombre del Centro
	 * @param direccionCentro dirección del centro
	 * @param alumnosCentro Array con los alumnos del centro
	 */
	public Centros(int codCentro, String nombreCentro, String direccionCentro, List<Alumnos> alumnosCentro) {
		this.codCentro=codCentro;
		this.nombreCentro=nombreCentro;
		this.direccionCentro=direccionCentro;
		this.alumnoCentro=alumnosCentro;
	}
	/**
	 * Optiene los alumnos del centro
	 * @return the alumnosCentro
	 */
	public List<Alumnos> getAlumnoCentro() {
		return alumnoCentro;
	}
	/**
	 * Establece los alumnos del centro
	 * @param alumnosCentro the alumnosCentro to set
	 */
	public void setAlumnosCentro(List<Alumnos> alumnoCentro) {
		this.alumnoCentro = alumnoCentro;
	}
	/**
	 * Optiene el código del centro
	 * @return the codCentro
	 */
	public int getCodCentro() {
		return codCentro;
	}
	/**
	 * Establece el código del centro
	 * @param codCentro the codCentro to set
	 */
	public void setCodCentro(int codCentro) {
		this.codCentro = codCentro;
	}
	/**
	 * Optiene el nombre del centro
	 * @return the nombreCentro
	 */
	public String getNombreCentro() {
		return nombreCentro;
	}
	/**
	 * Establece el nombre del centro
	 * @param nombreCentro the nombreCentro to set
	 */
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	/**
	 * Optiene la direccion del centro
	 * @return the direccionCentro
	 */
	public String getDireccionCentro() {
		return direccionCentro;
	}
	/**
	 * Establece la direccion del centro
	 * @param direccionCentro the direccionCentro to set
	 */
	public void setDireccionCentro(String direccionCentro) {
		this.direccionCentro = direccionCentro;
	}
	@Override
	public String toString() {
		return "Nombre del Centro=" + nombreCentro + ", Dirección del Centro="+direccionCentro;
	}
}