package dominio;

import java.util.Date;

/* OperacionCabecera */
public class OperacionCabecera {

	private int codigo;
	private int codigoTipoDocumento;//1=dni, 2=ruc
	private Cliente cliente;
	private int codigoMoneda;//1=soles, 2=dolares
	private int tipoOperacion;//1=venta, 2=compra
	private Usuario usuario;
	private String numeroDocumento;
	private String concepto;
	private Date fecha_emision;
	private String empresa;
	private Date fechaVencimiento;
	private Date fechaPago;
	private int estado;//1=nuevo, 2=anulada, 3=cancelada		
	
    public OperacionCabecera(int codigo,
	 int codigoTipoDocumento,
	 Cliente cliente,
	 int codigoMoneda,
	 int tipoOperacion,
	 Usuario usuario,
	 String numeroDocumento,
	 String concepto,
	 Date fecha_emision,
	 String empresa,
	 Date fechaVencimiento,
	 Date fechaPago,
	 int estado) 
    {
    	
    	this.codigo = codigo;
    	this.codigoTipoDocumento = codigoTipoDocumento;
    	this.cliente = cliente;
    	this.codigoMoneda = codigoMoneda;
    	this.tipoOperacion = tipoOperacion;
    	this.usuario = usuario;
    	this.numeroDocumento = numeroDocumento;
    	this.concepto = concepto;
    	this.fecha_emision = fecha_emision;
    	this.empresa = empresa;
    	this.fechaVencimiento = fechaVencimiento;
		this.fechaPago = fechaPago;
		this.estado = estado;
        
    }
	
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
	public int getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(int codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public int getTipoOperacion() {
		return tipoOperacion;
	}
	public void setTipoOperacion(int tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
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
