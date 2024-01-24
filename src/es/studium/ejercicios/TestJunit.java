package es.studium.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestJunit {

	@Test
	void camino1() 
	{
		boolean resultadoReal = true;
		boolean resultadoEsperado = Cajablanca.esPar(4);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void camino2() 
	{
		boolean resultadoReal = false;
		boolean resultadoEsperado = Cajablanca.esPar(3);
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
}
