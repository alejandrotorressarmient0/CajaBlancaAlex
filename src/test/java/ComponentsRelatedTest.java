import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

class ComponentsRelatedTest {
	
	Grafo grafoUnNodo = new Grafo();
	Grafo grafoDosNodosUnaArista = new Grafo();
	Grafo grafoUnNodoUnaArista = new Grafo();
	Grafo grafoDosNodosSinUnir = new Grafo();
	
	@BeforeEach
	void setUp() {
		grafoUnNodo.addVertice(1);
		grafoDosNodosUnaArista.addVertice(1);
		grafoDosNodosUnaArista.addVertice(2);
		grafoDosNodosUnaArista.addArco(new Arco(1,2,0));
		grafoUnNodoUnaArista.addVertice(1);
		grafoUnNodoUnaArista.addArco(new Arco(1,1,0));
		grafoDosNodosSinUnir.addVertice(1);
		grafoDosNodosSinUnir.addVertice(2);
	}

	@Test
	void grafoUnNodo() {
		assertEquals("[1]",grafoUnNodo.componentsRelated());
	}
	
	@Test
	void grafoDosNodosUnaArista() {
		assertEquals("[1 2]",grafoDosNodosUnaArista.componentsRelated());
	}
	
	@Test
	void grafoUnNodoUnaArista() {
		assertEquals("[1]",grafoUnNodoUnaArista.componentsRelated());
	}
	
	@Test
	void grafoDosNodosSinUnir() {
		assertEquals("[1][2]",grafoDosNodosSinUnir.componentsRelated());
	}

}
