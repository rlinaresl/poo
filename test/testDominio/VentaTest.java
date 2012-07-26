package testDominio;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;

import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import controlador.VentaControlador;
import dominio.Cliente;
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
        
        ventaCabe = new OperacionCabecera(1, 1, cli, 1, 1, usu, "IN00001", "", fechaEmision, "Solutions Peru Sac", fechaVencimiento, fechaPago, 1);
        
        
        VentaControlador ventaCo = new VentaControlador();
        int resultado = ventaCo.crearVentaCabe(ventaCabe);
        
        //verifico
        assertEquals(1, resultado, 0);        

    }
	
}
