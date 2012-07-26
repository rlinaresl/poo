package testDominio;

import junit.framework.Assert;
import org.junit.Test;

import controlador.ClienteControlador;
import controlador.UsuarioControlador;
import dominio.Cliente;
import dominio.Usuario;
import dominio.OperacionCabecera;

public class VentaTest {

	
	
	
	@Test
    public void crearVentaTest() {

        OperacionCabecera ventaCabe = new OperacionCabecera();
        
        ClienteControlador clienteCo = new ClienteControlador();
        Cliente cli = clienteCo.BuscarCliente("0610428");
        
        UsuarioControlador usuarioCo = new UsuarioControlador();
        Usuario usu = usuarioCo.BuscarUsuario(1);
        
        
        //ventaCabe = new OperacionCabecera(codigo, codigoTipoDocumento, cliente, codigoMoneda, tipoOperacion, usuario, numeroDocumento, concepto, fecha_emision, empresa, fechaVencimiento, fechaPago, estado);
        
        
        
        /*

        usuario.setCorreo("micorreo@website.net");
        usuario.setClave("clave");
        usuario.setFlagTerminosLegales(true);        
        
        Assert.assertEquals("micorreo@website.net", usuario.getCorreo());
        Assert.assertEquals("clave", usuario.getClave());
        Assert.assertTrue(usuario.isFlagTerminosLegales());
        */        

    }
	
}
