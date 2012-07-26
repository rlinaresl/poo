package dominio;

public class GrupoEstudio {

	Util util = new Util();
	
	private String nombre = "";
	private String descripcion;
	private String academia;
	private String curso;
	private String fechainicio = "00/00/0000";
	private String fechafin = "00/00/0000";
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
	public String getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getFechafin() {
		return fechafin;
	}
	public void setFechafin(String fechafin) {
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
		else if(this.getFechainicio()=="00/00/0000") return "ERROR, al menos ingrese la fecha de inicio del grupo.";
		else if(this.getFechafin()=="00/00/0000") return "ERROR, al menos ingrese la fecha de inicio del grupo.";
		else return "OK";
	}

	
}
