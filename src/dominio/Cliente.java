package dominio;

public class Cliente {
	/* Cliente */

	private String codigo;	
	private String nombres;
	private String apellidos;
	private int tipoCliente;//1=prospecto, 2=contacto, 3=cliente
	private int codigoTipoDocumento;
	private String numeroDocumento;	
	private String telefono;	
	private String correo;    
	private String direccion;    
	private String ciudad;    
	private String estado;   
	private String pais;    
		
	public Cliente(String codigo, String nombres, String apellidos, int tipoCliente, int codigoTipoDocumento, String numeroDocumento,String telefono, String correo, String direccion, 
			String ciudad, String estado, String pais) {
		setCodigo(codigo);
		setNombres(nombres);
		setApellidos(apellidos);
		setTipoCliente(tipoCliente);
		setCodigoTipoDocumento(codigoTipoDocumento);
		setNumeroDocumento(numeroDocumento);
        setTelefono(telefono);
        setCorreo(correo);
        setDireccion(direccion);
        setCiudad(ciudad);
        setEstado(estado);
        setPais(pais);
    }
		
	public int getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
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

	public int getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}

	public void setCodigoTipoDocumento(int codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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
