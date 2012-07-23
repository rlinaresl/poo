package testDominio;

import junit.framework.Assert;
import org.junit.Test;
import dominio.Usuario;

public class UsuarioTest {
	/* UsuarioTest */

    @Test
    public void testMetodosBasicos() {

        Usuario usuario = new Usuario();

        usuario.setCorreo("micorreo@website.net");
        usuario.setClave("clave");          
        
        Assert.assertEquals("micorreo@website.net", usuario.getCorreo());
        Assert.assertEquals("clave", usuario.getClave());
        
        
        

    }
    @Test
    public void testInicioDeSesion()
    {
    	Usuario usuario = new Usuario();
    	boolean valor = usuario.validarInformacion("correo@correo.com", "qwerty");
    	Assert.assertEquals(true, valor);
    	
    }
    
    
}
