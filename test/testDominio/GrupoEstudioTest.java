package testDominio;

import static org.junit.Assert.*;
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
		GrupoEstudio g = new GrupoEstudio();
		int cantidad;
		String termino = "The Hackers";
		cantidad = g.buscarGrupoEstudio(termino);
		if(cantidad>=1) System.out.println("Existen : " + cantidad + " coincidencias para el termino " + termino);
		else System.out.println("No existen coincidencias para el termino " + termino);
		assertNotSame(0, cantidad);
	}
}
