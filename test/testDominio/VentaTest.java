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
        Date fechaVencimiento = Util.getFecha("10/08/2012");
        Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("10/09/2012");               
        
                
        OperacionDetalle ventaDeta = null;
        
        ventaDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);        
        ventaCabe = new OperacionCabecera(4, 1, cli, 1, 1, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, ventaDeta);
        
        VentaControlador ventaCo = new VentaControlador();
        int resultado = ventaCo.crearVentaCabe(ventaCabe);
        
        assertEquals(1, resultado, 0);

    }
	
	
	@Test
    public void updateVentaTest() {                		
		
		
		
    }
	
	@Test
    public void eliminarVentaTest() {                		
		
		
		
    }
	
	
	@Test
	public void cambiarEstadoVentatest()
	{
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = ventaCo.buscarVenta(1);		
		boolean resultado = ventaCo.cambiarEstadoVenta(venta);
		assertTrue("No existe la Venta", resultado);
	}
	
	@Test
	public void buscarVentaCodigoTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		OperacionCabecera venta = new OperacionCabecera();
		venta.setCodigo(1);
		
		boolean resultado = ventaCo.buscarVentaCodigo(venta);
		assertTrue("No existe la Venta", resultado);
		
	}
	
	@Test
	public void buscarVentaClienteTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");
        
		
		boolean resultado = ventaCo.buscarVentaCliente(cli);
		assertTrue("No existe la Venta", resultado);
		
	}
	
	@Test
	public void buscarVentaUsuarioTest()
	{
			
		VentaControlador ventaCo = new VentaControlador();
		UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
		
		boolean resultado = ventaCo.buscarVentaUsuario(usu);
		assertTrue("No existe la Venta", resultado);
		
	}
	
	
	
}
