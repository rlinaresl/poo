package dominio;

import java.util.Date;
	/* VentaCabe */
public class VentaCabe {

	private int codigo;
	private int codigoTipoDocumento;//1=dni, 2=ruc
	private Cliente cliente;
	private int codigo_moneda;//1=soles, 2=dolares
	private Usuario usuario;
	private String numeroDocumento;
	private String concepto;
	private Date fecha_emision;
	private String empresa;
	private Date fechaVencimiento;
	private Date fechaPago;
	private int estado;//1=nuevo, 2=anulada, 3=cancelada
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}
	public void setCodigoTipoDocumento(int codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getCodigo_moneda() {
		return codigo_moneda;
	}
	public void setCodigo_moneda(int codigo_moneda) {
		this.codigo_moneda = codigo_moneda;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Date getFecha_emision() {
		return fecha_emision;
	}
	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
