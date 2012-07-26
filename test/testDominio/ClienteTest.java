package testDominio;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Cliente;

public class ClienteTest {

	@Test
	public void testDeClienteValidado()
	{
		
	}
	
	@Test
	public void testDarAltaCliente()
	{
		String codigo = "3434";
		String nombres = "Ronald";
		String apellidos = "Quilca";
		int tipoCliente = 3;
		int codigoTipoDocumento = 3;
		String numeroDocumento = "";
		String telefono="";
		String correo = "";
		String direccion = "";
		String ciudad = "";
		String estado = "";
		String pais = "Perú";
		Cliente c = new Cliente(codigo, nombres, apellidos, tipoCliente, codigoTipoDocumento, numeroDocumento, telefono, correo, direccion, 
			ciudad, estado, pais);
		assertEquals("Quilca",c.getApellidos());
	}
	
	@Test
	public void testInscribirClienteGrupodeestudio()
	{
		
	}
}
