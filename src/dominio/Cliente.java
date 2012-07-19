package dominio;

public class Cliente {
	/* Cliente */

	private String codigo;	
	private String nombres;
	private String apellidos;
	private int codigo_tipo_documento;
	private String numero_documento;	
	private String telefono;	
	private String correo;    
	private String direccion;    
	private String ciudad;    
	private String estado;   
	private String pais;    
		
	public Cliente(String codigo, String nombres, String apellidos, int codigo_tipo_documento, String numero_documento,String telefono, String correo, String direccion, 
			String ciudad, String estado, String pais) {
		setCodigo(codigo);
		setNombres(nombres);
		setApellidos(apellidos);
		setCodigo_tipo_documento(codigo_tipo_documento);
		setNumero_documento(numero_documento);
        setTelefono(telefono);
        setCorreo(correo);
        setDireccion(direccion);
        setCiudad(ciudad);
        setEstado(estado);
        setPais(pais);
    }
		
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
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

	public int getCodigo_tipo_documento() {
		return codigo_tipo_documento;
	}

	public void setCodigo_tipo_documento(int codigo_tipo_documento) {
		this.codigo_tipo_documento = codigo_tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
