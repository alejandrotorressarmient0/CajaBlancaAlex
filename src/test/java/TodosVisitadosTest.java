import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

class TodosVisitadosTest {
	
	Grafo grafoVacio = new Grafo();
	Grafo grafoUnNodo = new Grafo();
	
	@BeforeEach
	void setUp() {
		grafoUnNodo.addVertice(1);
	}

	@Test
	void grafoVacio() {
		String resultado = grafoVacio.componentsRelated();
		assertEquals("",resultado);
	}
	
	@Test
	void grafoUnNodo() {
		String resultado = grafoUnNodo.componentsRelated();
		assertEquals("[1]",resultado);
	}
	
	
}
