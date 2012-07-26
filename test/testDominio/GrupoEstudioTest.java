package testDominio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import dominio.GrupoEstudio;

public class GrupoEstudioTest {
	
	@Test
	public void testDarAltaGrupoEstudio()
	{
		GrupoEstudio g = new GrupoEstudio();
		g.setNombre("The Hackers");
		g.setFechainicio("01/01/2012");
		g.setFechafin("01/01/2012");
		String mensajeAlta;
		mensajeAlta = g.DarAltaGrupoEstudio();
		System.out.println("El estado de la Alta del Grupo de Estudio es: " + mensajeAlta);
		assertEquals("OK", mensajeAlta);
	}

	@Test
	public void testBuscarGrupoEstudio()
	{
		
	}
}
