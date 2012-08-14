package testDominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.Date;
import org.junit.Test;
import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import controlador.CompraControlador;
import dominio.Cliente;
import dominio.OperacionCabecera.Estado;
import dominio.OperacionCabecera.TipoOperacion;
import dominio.OperacionDetalle;
import dominio.Usuario;
import dominio.OperacionCabecera;
import dominio.Util;

public class CompraTest {
	
	@Test
    public void crearCompraTest() {        
        
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610429");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(3);        
        
        OperacionCabecera compraCabe = null;
        Date fechaVencimiento = Util.getFecha("18/08/2012");
        //Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("14/08/2012");               
        
        OperacionDetalle compraDeta = null;
        
        compraDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);        
        compraCabe = new OperacionCabecera(5, 1, cli, 1, TipoOperacion.COMPRA, usu, "VE00005", fechaEmision, "",fechaVencimiento, null, Estado.NUEVO, compraDeta);
        
        CompraControlador compraCo = new CompraControlador();
        int resultado = compraCo.crearCompraCabe(compraCabe);
        
        assertEquals(1, resultado, 1);

    }
	
	
	@Test
    public void editarCompraTest() {                		
		
		CompraControlador compra = new CompraControlador();
		OperacionCabecera obj = compra.buscarCompra(1);
		Date fechaVencimiento = Util.getFecha("18/08/2012");
		obj.setFechaVencimiento(fechaVencimiento);
		int resultado = 0;
		try {
			resultado = compra.editarCompraCabe(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
		assertEquals(1, resultado, 1);
		
    }
	
	@Test
    public void eliminarCompraTest() {                		
		
		CompraControlador compra = new CompraControlador();
		OperacionCabecera obj = compra.buscarCompra(1);

		int resultado = 0;
		try {
			resultado = compra.eliminarCompraCabe(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(resultado);

		assertEquals(resultado, 0);

    }
	
	
	@Test
	public void cambiarEstadoCompraTest()
	{
		CompraControlador compraCo = new CompraControlador();
		OperacionCabecera compra = compraCo.buscarCompra(1);
		
		//Si la compra va ser pagada.
		//Date fechaPago = Util.getFecha("13/08/2012");		
		//c.setFechaPago(fechaPago);
		
		compra.setEstado(Estado.CANCELADA);
		//compra.setEstado(Estado.NUEVO);
		
		boolean resultado = false;
		
		try {
			resultado = compraCo.cambiarEstadoCompra(compra);
			System.out.println("Compra Actualizada Correctamente");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		assertTrue(resultado);
	}
	
	@Test
	public void buscarCompraCodigoTest()
	{
			
		CompraControlador compraCo = new CompraControlador();
		OperacionCabecera compra = new OperacionCabecera();
		compra.setCodigo(1);
		
		boolean resultado = compraCo.buscarCompra(compra);
		assertTrue("No existe la Compra", resultado);
		
	}
	
	@Test
	public void buscarCompraClienteTest()
	{
			
		CompraControlador compraCo = new CompraControlador();
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610429");
        
		
		boolean resultado = compraCo.buscarCompraCliente(cli);
		assertTrue("No existe la Compra", resultado);
		
	}
	
	@Test
	public void buscarCompraUsuarioTest()
	{
			
		CompraControlador compraCo = new CompraControlador();
		UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(2);
		
		boolean resultado = compraCo.buscarCompraUsuario(usu);
		assertTrue("No existe la Compra", resultado);
		
	}
	
	
}
