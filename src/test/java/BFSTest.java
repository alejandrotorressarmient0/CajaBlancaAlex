import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cajablanca.grafo.*;

class BFSTest {
	
	Grafo grafoUnNodo = new Grafo();
	Grafo grafoUnNodoUnaArista = new Grafo();
	Grafo grafoDosNodos = new Grafo();
	
	@BeforeEach
	void setUp(){
		grafoUnNodo.addVertice(1);
		grafoUnNodoUnaArista.addVertice(1);
		grafoUnNodoUnaArista.addArco(new Arco(1,1,0));
		grafoDosNodos.addVertice(1);
		grafoDosNodos.addVertice(2);
		grafoDosNodos.addArco(new Arco(1,2,0));
	}
	
	@Test
	void noExisteNodoEnGrafo() {
		assertThrows(NoSuchElementException.class, ()->grafoUnNodo.BFS(2));
	}
	
	@Test
	void grafoUnNodo() {
		assertEquals("[1]",grafoUnNodo.BFS(1));
	}
	
	@Test
	void grafoUnNodoUnaArista() {
		assertEquals("[1]",grafoUnNodoUnaArista.BFS(1));
	}
	
	@Test
	void grafoDosNodos() {
		assertEquals("[1 2]",grafoDosNodos.BFS(1));
	}
	
}
