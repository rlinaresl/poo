package dominio;

import java.util.Date;

/* OperacionCabecera */
public class OperacionCabecera {

	public enum Estado
	{
		NUEVO, ANULADA, CANCELADA
	}
	
	public enum TipoOperacion
	{
		VENTA, COMPRA
	}
	
	private int codigo;
	private int codigoTipoDocumento;//1=dni, 2=ruc
	private Cliente cliente;
	private int codigoMoneda;//1=soles, 2=dolares
	private TipoOperacion tipoOperacion;//1=venta, 2=compra
	private Usuario usuario;
	private String numeroDocumento;	
	private Date fecha_emision;
	private String empresa;
	private Date fechaVencimiento;
	private Date fechaPago;
	private OperacionDetalle operacionDetalle;
	private Estado estado;//1=nuevo, 2=anulada, 3=cancelada		
	
	public OperacionCabecera(){
		
	}
	
	public OperacionCabecera(int codigo,
	 int codigoTipoDocumento,
	 Cliente cliente,
	 int codigoMoneda,
	 TipoOperacion tipoOperacion,
	 Usuario usuario,
	 String numeroDocumento,	 
	 Date fecha_emision,
	 String empresa,
	 Date fechaVencimiento,
	 Date fechaPago,
	 Estado estado, 
	 OperacionDetalle operacionDetalle) 
    {
    	
    	this.codigo = codigo;
    	this.codigoTipoDocumento = codigoTipoDocumento;
    	this.cliente = cliente;
    	this.codigoMoneda = codigoMoneda;
    	this.tipoOperacion = tipoOperacion;
    	this.usuario = usuario;
    	this.numeroDocumento = numeroDocumento;    	
    	this.fecha_emision = fecha_emision;
    	this.empresa = empresa;
    	this.fechaVencimiento = fechaVencimiento;
		this.fechaPago = fechaPago;
		this.estado = estado;
		this.operacionDetalle = operacionDetalle;
        
    }
	
	public OperacionDetalle getOperacionDetalle() {
		return operacionDetalle;
	}

	public void setOperacionDetalle(OperacionDetalle operacionDetalle) {
		this.operacionDetalle = operacionDetalle;
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

	public TipoOperacion getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(TipoOperacion tipoOperacion) {
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
		
}
