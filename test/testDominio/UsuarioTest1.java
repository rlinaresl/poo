package testDominio;
import static org.junit.Assert.*;
import junit.framework.Assert;

//import org.junit.Before;
import org.junit.Test;



import dominio.Usuario1;
import dominio.Usuario1.Perfil;

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
		
		usuario1.setCodigo(4);
		usuario1.setNombres("Juan Miguel");
		usuario1.setApellidos("XXXXX");
		usuario1.setCorreo("JM2@gmail.com");
		usuario1.setClave("44444");
		usuario1.setPerfil(Perfil.USUARIO);
		String mensaje="";
		
		try {
			mensaje = usuario1.RegistrarUsuario();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Registro de usuario: " + mensaje);
		assertEquals("OK", mensaje);
	}
	
	@Test
	public void TestBuscarUsuarioCodigo(){
		
		Usuario1 usuario1 =new Usuario1();
		int codigo1=usuario1.BuscarUsuario(1);
		System.out.println("Codigo para enviar: "+codigo1);
		assertEquals(1,codigo1);
	}
	
	@Test
	public void TestEliminarUsuario(){
		
		Usuario1 usuario1=new Usuario1();
		boolean codigo1=usuario1.EliminarUsuario(1);
		System.out.println("Usuario eliminado: "+codigo1);
		assertEquals(true,codigo1);
		
		
	}
	
}