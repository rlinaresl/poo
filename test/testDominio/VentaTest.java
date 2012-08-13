package testDominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Date;
import org.junit.Test;
import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import controlador.VentaControlador;
import dominio.Cliente;
import dominio.OperacionCabecera.Estado;
import dominio.OperacionCabecera.TipoOperacion;
import dominio.OperacionDetalle;
import dominio.Usuario;
import dominio.OperacionCabecera;
import dominio.Util;

public class VentaTest {
	
	@Test
    public void crearVentaTest() {        
        
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);        
        
        OperacionCabecera ventaCabe = null;
        Date fechaVencimiento = Util.getFecha("18/08/2012");
        //Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("14/08/2012");               
        
                
        OperacionDetalle ventaDeta = null;
        
        ventaDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);        
        ventaCabe = new OperacionCabecera(7, 1, cli, 1, TipoOperacion.VENTA, usu, "IN00002", fechaEmision, "",fechaVencimiento, null, Estado.NUEVO, ventaDeta);
        
        VentaControlador ventaCo = new VentaControlador();
        boolean resultado = ventaCo.crearVentaCabe(ventaCabe);
        
        assertTrue(resultado);

    }
	
	
	@Test
    public void editarVentaTest() {                		
		
		VentaControlador venta = new VentaControlador();
		OperacionCabecera obj = venta.buscarVenta(1);
		Date fechaVencimiento = Util.getFecha("18/08/2012");
		obj.setFechaVencimiento(fechaVencimiento);
		int resultado = 0;
		try {
			resultado = venta.editarVentaCabe(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
		assertEquals(1, resultado, 1);
		
    }
	
	@Test
    public void eliminarVentaTest() {                		
		
		VentaControlador venta = new VentaControlador();
		OperacionCabecera obj = venta.buscarVenta(1);
		
		int resultado = 0;
		try {
			resultado = venta.eliminarVentaCabe(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(resultado);
		
		assertEquals(resultado, 0);
		
    }
	
	
	@Test
	public void cambiarEstadoVentatest()
	{
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = ventaCo.buscarVenta(5);
		
		//Si la venta va ser pagada.
		//Date fechaPago = Util.getFecha("13/08/2012");		
		//venta.setFechaPago(fechaPago);
		
		venta.setEstado(Estado.CANCELADA);
		
		boolean resultado = false;
		
		try {
			resultado = ventaCo.cambiarEstadoVenta(venta);
			System.out.println("Venta Actualizada Correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		assertTrue(resultado);
	}
	
	
	@Test
	public void buscarVentaCodigoTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = new OperacionCabecera();
		venta.setCodigo(1);
		
		boolean resultado = ventaCo.buscarVenta(venta);
		assertTrue("No existe la Venta", resultado);
		
	}	
	
	@Test
	public void rptVentasXFechasEmisionTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = new OperacionCabecera();
		venta.setCodigo(1);
		
		Date f1 = Util.getIsFecha("25/06/2012");
		Date f2 = Util.getIsFecha("01/07/2012");
		
		int resultado = ventaCo.rptVentasXFechas(f1, f2);
		assertEquals(resultado, 1);
		
	}	
	
	
	
	/*
	@Test
	public void buscarVentaClienteTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");
        
		
		boolean resultado = ventaCo.buscarVentaCliente(cli);
		assertTrue("No existe la Venta", resultado);
		
	}	
	*/
	
	/*
	@Test
	public void buscarVentaUsuarioTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
		
		boolean resultado = ventaCo.buscarVentaUsuario(usu);
		assertEquals(true, resultado, 1);
		
	}
	*/	
	
}
