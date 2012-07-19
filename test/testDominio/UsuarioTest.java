package testDominio;

import junit.framework.Assert;
import org.junit.Test;
import dominio.Usuario;

public class UsuarioTest {
	/* UsuarioTest */

    @Test
    public void testMetodosBasicos() {

        Usuario usuario = new Usuario();

        usuario.setCorreo("usa@usa.net");
        usuario.setClave("clave");
        usuario.setFlagTerminosLegales(true);        
        
        Assert.assertEquals("usa@usa.net", usuario.getCorreo());
        Assert.assertEquals("clave", usuario.getClave());
        Assert.assertTrue(usuario.isFlagTerminosLegales());
        

    }
}
