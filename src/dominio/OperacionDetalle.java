package dominio;

public class OperacionDetalle {
	
	/* OperacionDetalle */
	
	private OperacionCabecera operacion;
	private String concepto;
	private double precio;
	private int cantidad;
	private double igv;
	private double total;
	
	public OperacionCabecera getOperacion() {
		return operacion;
	}
	public void setOperacion(OperacionCabecera operacion) {
		this.operacion = operacion;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
