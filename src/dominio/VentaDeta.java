package dominio;

public class VentaDeta {
	/* VentaDeta */
	private VentaCabe venta;
	private String concepto;
	private double igv;
	private double total;
	
	
	public VentaCabe getVenta() {
		return venta;
	}
	public void setVenta(VentaCabe venta) {
		this.venta = venta;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
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
