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
		Cliente c = new Cliente();
		
		c.setCodigo("45547A");
		c.setNombres("Ronald");
		c.setApellidos("Quilca");
		c.setTipoCliente(3);
		c.setCodigoTipoDocumento(1);
		c.setNumeroDocumento("145465");
		c.setTelefono("234234");
		c.setCorreo("juan@juan.com");
		c.setDireccion("Av. Los Alamos 3434");
		c.setCiudad("Lima");
		c.setEstado("1");
		c.setPais("Peru");
		String mensajeAlta;
		mensajeAlta = c.DarAltaCliente();
		System.out.println("El estado de la Alta de Cliente es: " + mensajeAlta);
		assertEquals("OK", mensajeAlta);
	}
	
	@Test
	public void testInscribirClienteEnGrupoEstudio()
	{
		
	}
}
