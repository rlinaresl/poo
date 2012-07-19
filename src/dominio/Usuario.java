package dominio;

public class Usuario {

	private String correo;
	private String clave;
	private boolean flagTerminosLegales;

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isFlagTerminosLegales() {
		return flagTerminosLegales;
	}

	public void setFlagTerminosLegales(boolean flagTerminosLegales) {
		this.flagTerminosLegales = flagTerminosLegales;
	}

}