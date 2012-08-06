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
        Cliente cli = clienteCo.BuscarCliente("0610430");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);        
        
        OperacionCabecera compraCabe = null;
        Date fechaVencimiento = Util.getFecha("10/08/2012");
        Date fechaPago = Util.getFecha("10/10/2012");        
        Date fechaEmision = Util.getFecha("10/09/2012");               
                        
        OperacionDetalle compraDeta = null;
        
        compraDeta = new OperacionDetalle("servicio de hosting", 410, 1, 90, 500);        
        compraCabe = new OperacionCabecera(4, 1, cli, 1, TipoOperacion.COMPRA, usu, "IN00001", fechaEmision, "",fechaVencimiento, fechaPago, Estado.NUEVO, compraDeta);
        
        CompraControlador compraCo = new CompraControlador();
        int resultado = compraCo.crearCompraCabe(compraCabe);
        
        assertEquals(1, resultado, 0);

    }
	
	@Test
    public void updateCompraTest() {                		
		
    }
	
	@Test
    public void eliminarCompraTest() {                		
		
    }
	
	@Test
	public void cambiarEstadoCompratest() {
		
		CompraControlador compraCo = new CompraControlador();
		OperacionCabecera compra = compraCo.buscarCompra(1);		
		boolean resultado = compraCo.cambiarEstadoCompra(compra);
		assertTrue("No existe la Compra", resultado);
	}
	
	@Test
	public void buscarCompraCodigoTest() {
			
		CompraControlador compraCo = new CompraControlador();
		OperacionCabecera compra = new OperacionCabecera();
		compra.setCodigo(1);
		
		boolean resultado = compraCo.buscarCompraCodigo(compra);
		assertTrue("No existe la Compra", resultado);
		
	}
	
	@Test
	public void buscarCompraClienteTest() {
			
		CompraControlador compraCo = new CompraControlador();
		ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610430");
        
		boolean resultado = compraCo.buscarCompraCliente(cli);
		assertTrue("No existe la Compra", resultado);
		
	}
	
	@Test
	public void buscarCompraUsuarioTest() {
			
		CompraControlador compraCo = new CompraControlador();
		UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
		
		boolean resultado = compraCo.buscarCompraUsuario(usu);
		assertTrue("No existe la Compra", resultado);
		
	}
	
}
