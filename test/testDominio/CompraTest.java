package testDominio;

import static org.junit.Assert.assertEquals;
import java.util.Date;
import junit.framework.Assert;
import org.junit.Test;

import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import controlador.CompraControlador;
import dominio.Cliente;
import dominio.OperacionDetalle;
import dominio.Usuario;
import dominio.OperacionCabecera;
import dominio.Util;
import dominio.OperacionCabecera.Estado;

public class CompraTest {
	
	@Test
    public void crearCompraTest() {        
        
        ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610430");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);        
        
        OperacionCabecera compraCabe = null;
        Date fechaVencimiento = Util.getFecha("01/10/2012");
        Date fechaPago = Util.getFecha("01/10/2012");        
        Date fechaEmision = Util.getFecha("01/10/2012");               
                       
        OperacionDetalle compraDeta = null;
        
        compraDeta = new OperacionDetalle("servicio de consultoria", 400, 1, 72, 472);
        compraCabe = new OperacionCabecera(1, 1, cli, 1, 1, usu, "VE00001", fechaEmision, "", fechaVencimiento, fechaPago, Estado.NUEVO, compraDeta);  
        
        CompraControlador compraCo = new CompraControlador();
        int resultado = compraCo.crearCompraCabe(compraCabe);
        
        //verifico
        assertEquals(1, resultado, 0);        

    }
	
}
