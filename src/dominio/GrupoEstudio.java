package dominio;

import java.util.Date;

public class GrupoEstudio {

	private String nombre = "";
	private String descripcion;
	private String academia;
	private String curso;
	private Date fechainicio = Util.getFecha("01/01/2012");
	private Date fechafin = Util.getFecha("01/01/2012");
	private String instructores;
	private String syllabus;
	private String local;
	private String aula;
	private String coordenadax;
	private String coordenaday;
	private String estado; //en curso, cancelado, finalizado
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAcademia() {
		return academia;
	}
	public void setAcademia(String academia) {
		this.academia = academia;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public String getInstructores() {
		return instructores;
	}
	public void setInstructores(String instructores) {
		this.instructores = instructores;
	}
	public String getSyllabus() {
		return syllabus;
	}
	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getCoordenadax() {
		return coordenadax;
	}
	public void setCoordenadax(String coordenadax) {
		this.coordenadax = coordenadax;
	}
	public String getCoordenaday() {
		return coordenaday;
	}
	public void setCoordenaday(String coordenaday) {
		this.coordenaday = coordenaday;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String DarAltaGrupoEstudio() {
		if(this.getNombre()=="") return "ERROR, al menos ingrese el nombre del grupo.";
		else if(this.getFechainicio()==Util.getFecha("01/01/2012")) return "ERROR, al menos ingrese la fecha de inicio del grupo.";
		else if(this.getFechafin()==Util.getFecha("01/01/2012")) return "ERROR, al menos ingrese la fecha de inicio del grupo.";
		else return "OK";
	}

	
}
