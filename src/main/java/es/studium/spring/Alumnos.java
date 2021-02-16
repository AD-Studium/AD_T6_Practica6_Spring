package es.studium.spring;


/**
 * Clase Alumnos, tiene la informacion de los alumnos
 * @author Alvca
 * @since 2021
 * @version 1.0
 */
public class Alumnos {
	private String nombreAlumno;
	private String direccionAlumno;
	private int numeroMatricula;
	private double notaAsignatura;
	private int horasAsignatura;
	private Centros centroAlumno;
	private Asignaturas asignatura;
	/**
	 * Constructor sin parámetros
	 */
	public Alumnos() {
		nombreAlumno="";
		direccionAlumno="";
		numeroMatricula=0;
		notaAsignatura=0.0;
		horasAsignatura=0;
		setCentroAlumno(new Centros());
		setAsignatura(new Asignaturas());
	}
	/**
	 * Constructor con parámetros
	 * @param nombreAlumno Nombre del alumno
	 * @param direccionAlumno Direción del alumno
	 * @param notaAsignatura Notas de asignatura
	 * @param horasAsignatura Horas de asignatura
	 * @param numeroMatricula Número de matrícula del alumno
	 */
	public Alumnos(String nombreAlumno, String direccionAlumno, double notaAsignatura,int horasAsignatura, int numeroMatricula, Centros nombreCentro, Asignaturas asignatura) {
		this.nombreAlumno=nombreAlumno;
		this.direccionAlumno=direccionAlumno;
		this.notaAsignatura=notaAsignatura;
		this.horasAsignatura=horasAsignatura;
		this.numeroMatricula=numeroMatricula;
		this.setCentroAlumno(nombreCentro);
		this.setAsignatura(asignatura);
	}
	/**
	 * Optener nota de la asignatura
	 * @return the notaAsignatura
	 */
	public double getNotaAsignatura() {
		return notaAsignatura;
	}
	/**
	 * Establecer nota de la asignatura
	 * @param notaAsignatura the notaAsignatura to set
	 */
	public void setNotaAsignatura(double notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}
	/**
	 * Optener horas de la asignatura
	 * @return the horasAsignatura
	 */
	public int getHorasAsignatura() {
		return horasAsignatura;
	}
	/**
	 * Establecer horas de la asignatura
	 * @param horasAsignatura the horasAsignatura to set
	 */
	public void setHorasAsignatura(int horasAsignatura) {
		this.horasAsignatura = horasAsignatura;
	}
	/**
	 * Optener nombre alumno
	 * @return the nombreAlumno
	 */
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	/**
	 * Establecer nombre alumno
	 * @param nombreAlumno the nombreAlumno to set
	 */
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	/**
	 * Optener la direción del alumno 
	 * @return the direccionAlumno
	 */
	public String getDireccionAlumno() {
		return direccionAlumno;
	}
	/**
	 * Establecer la direción del alumno
	 * @param direccionAlumno the direccionAlumno to set
	 */
	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}
	/**
	 * Optener número de matrícula
	 * @return the numeroMatricula
	 */
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	/**
	 * Establecer número de matrícula
	 * @param numeroMatricula the numeroMatricula to set
	 */
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	/**
	 * @return the nombreCentro
	 */
	public Centros getCentroAlumno() {
		return centroAlumno;
	}
	/**
	 * @param nombreCentro the nombreCentro to set
	 */
	public void setCentroAlumno(Centros centroAlumno) {
		this.centroAlumno = centroAlumno;
	}
	/**
	 * @return the asignatura
	 */
	public Asignaturas getAsignatura() {
		return asignatura;
	}
	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignaturas asignatura) {
		this.asignatura = asignatura;
	}
	@Override
	public String toString() {
		return "Nombre Alumno=" + nombreAlumno + " Asignatura=" + asignatura;
	}
	/**
	 * 
	 * @return centroAlumno.getDireccionCentro() Optiene la dirección del centro 
	 */
	public String getDireccionCentro() {
		return centroAlumno.getDireccionCentro();
	}
}
