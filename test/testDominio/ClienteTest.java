package testDominio;
import static org.junit.Assert.*;

import org.junit.Test;
import dominio.Cliente;

public class ClienteTest {
	

	@Test
	public void testDeClienteValidado()
	{
		Cliente cliente1 = new Cliente("1", "Luis", "Cabrera Aldui", 1, 0, "10771683", "4641228", "ealdui@hotmail.com", "Jr Ferrer 237", "Lima", "Lima", "peru" );
		
		// ASSERTS
		assertEquals("1", cliente1.getCodigo());
		assertEquals("Luis", cliente1.getNombres());
		assertEquals("Cabrera Aldui", cliente1.getApellidos());
		assertEquals("10771683", cliente1.getNumeroDocumento());
		assertEquals("ealdui@hotmail.com", cliente1.getCorreo());
		assertEquals("4641228", cliente1.getTelefono());
	}
}
