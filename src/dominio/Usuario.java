package dominio;

public class Usuario {
	
	/* Usuario */

	private int codigo;
	private String nombres;
	private String apellidos;	
	private String correo;
	private String clave;
	private int estado;
	
	public Usuario(){}
	
	public Usuario(int codigo,
	 String nombres,
	String apellidos,	
	String correo,
	String clave,
	int estado)
	{
		this.codigo=codigo;
		this.nombres = nombres;
		this.apellidos=apellidos;
		this.correo=correo;
		this.clave=clave;
		this.estado= estado;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}

	public boolean validarInformacion(String correo, String clave) {
		// TODO Auto-generated method stub
		if(correo=="correo@correo.com" && clave=="qwerty")
			return true;
		else return false;
	}
	
	
	
	
	
}