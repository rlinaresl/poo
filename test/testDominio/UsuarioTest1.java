package testDominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dominio.Usuario1;

public class UsuarioTest1 {

	String usuario="Ricardo";
	String pass="jojolete";
	
	@Before
	public void inicio (){
		
				
	}
	@Test
	
	public void DebeTenerUsuarioContraseña(){
		Usuario1 verificar=new Usuario1();
		boolean resultado=verificar.datos("Ricardo","jojolete" );
		assertEquals(true,resultado);
	}
				 
	
}
