package dominio;

import java.util.Date;
	/* VentaCabe */
public class VentaCabe {

	private int codigo;
	private int codigo_tipo_documento;//1=dni, 2=ruc
	private Cliente cliente;
	private int codigo_moneda;//1=soles, 2=dolares
	private Usuario usuario;
	private String numero_documento;
	private String concepto;
	private Date fecha_emision;
	private String empresa;
	private Date fecha_vencimiento;
	private Date fecha_pago;
	private int estado;//1=nuevo, 2=anulada, 3=cancelada
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCodigo_tipo_documento() {
		return codigo_tipo_documento;
	}
	public void setCodigo_tipo_documento(int codigo_tipo_documento) {
		this.codigo_tipo_documento = codigo_tipo_documento;
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
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
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
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public Date getFecha_pago() {
		return fecha_pago;
	}
	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
