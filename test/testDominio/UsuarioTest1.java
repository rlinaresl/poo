package testDominio;
import static org.junit.Assert.*;
import junit.framework.Assert;

//import org.junit.Before;
import org.junit.Test;



import dominio.Usuario1;

public class UsuarioTest1 {

	@Test
	
	public void testMetodosBasicos() {

	      Usuario1 usuario1 = new Usuario1();

	        usuario1.setCorreo("rlinareslivia@gmail.com");
	        usuario1.setClave("11111");          
	        
	        Assert.assertEquals("rlinareslivia@gmail.com", usuario1.getCorreo());
	       Assert.assertEquals("11111", usuario1.getClave());
	        
	  }
	
	
	@Test
	
	public void TestInicioSesion(){
		Usuario1 usuario1=new Usuario1();
		int resultado=usuario1.datos("rlinareslivia@gmail.com","11111");
		assertEquals(1,resultado);
	}
				 
	@Test
	
	public void TestRegistrarUsuario(){
	
		Usuario1 usuario1 = new Usuario1();
		
		usuario1.setCodigo(1);
		usuario1.setNombres("Juan Miguel");
		usuario1.setApellidos("XXXXX");
		usuario1.setCorreo("JM2@gmail.com");
		usuario1.setClave("44444");
		usuario1.setPerfil(2);
		String mensaje;
		mensaje = usuario1.RegistrarUsuario();
		System.out.println("Registro de usuario: " + mensaje);
		assertEquals("OK", mensaje);
	}
	
	@Test
	public void TestValidarCorreo(){
	 
		Usuario1 usuario1=new Usuario1();
		
		String mensaje2;
		mensaje2=usuario1.ValidarCorreo("JM2@gmail.com");
		System.out.println("Validacion de correo: " + mensaje2);
		assertEquals("Correcto", mensaje2);
		
		
	}
	
	
}