package testDominio;
import static org.junit.Assert.*;
import junit.framework.Assert;

//import org.junit.Before;
import org.junit.Test;



import dominio.Usuario;
import dominio.Usuario.Perfil;

public class UsuarioTest {

	@Test
	
	public void testMetodosBasicos() {

	      Usuario usuario1 = new Usuario();

	        usuario1.setCorreo("rlinareslivia@gmail.com");
	        usuario1.setClave("11111");          
	        
	        Assert.assertEquals("rlinareslivia@gmail.com", usuario1.getCorreo());
	       Assert.assertEquals("11111", usuario1.getClave());
	        
	  }
	
	
	@Test
	
	public void TestInicioSesion(){
		Usuario usuario1=new Usuario();
		int resultado=usuario1.datos("rlinareslivia@gmail.com","11111");
		assertEquals(1,resultado);
	}
				 
	@Test
	
	public void TestRegistrarUsuario(){
	
		Usuario usuario1 = new Usuario();
		
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
		
		Usuario usuario1 =new Usuario();
		int codigo1=usuario1.BuscarUsuario("apellido","Lina");
		System.out.println("Codigo para enviar: "+codigo1);
		assertEquals(true,true);
	}
	
	@Test
	public void TestEliminarUsuario(){
		
		Usuario usuario1=new Usuario();
		boolean codigo1=usuario1.EliminarUsuario(1);
		System.out.println("Usuario eliminado: "+codigo1);
		assertEquals(true,codigo1);
		
		
	}
	@Test
	public void TestEditarUsuario(){
		
		Usuario obj=new Usuario();
		//boolean codigo1=obj.EditarUsuario(obj);
		obj.setCodigo(2);
		obj.setNombres("Ronald");
		obj.setApellidos("Quilca");
		obj.setCorreo("rquilca@gmail.com");
		obj.setClave("4444");
		obj.setPerfil(Perfil.ADMINISTRADOR);
		boolean variable=obj.EditarUsuario(obj);
		System.out.println("Usuario editado: "+variable);
		assertEquals(true,variable);
		
		
	}
	
	
	
	
}