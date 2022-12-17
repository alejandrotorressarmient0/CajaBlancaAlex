import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;

class ExistePalabraTest {
	
	Editor editorVacio = new Editor();
	Editor editorUnaPalabra = new Editor();
	Editor editorDosPalabras = new Editor();
	
	@BeforeEach
	void setUp() {
		editorVacio.cargarEditor("editorVacio.txt");
		editorUnaPalabra.cargarEditor("editorUnaPalabra.txt");
		editorDosPalabras.cargarEditor("editor2PalabrasPrimeraMayor.txt");
	}

	@Test
	void editorVacio() {
		assertFalse(editorVacio.existePalabra("Hola"));
	}
	
	@Test
	void editorUnaPalabraBuscada() {
		assertTrue(editorUnaPalabra.existePalabra("Hola"));
	}
	
	@Test
	void editorDosPalabras() {
		assertTrue(editorDosPalabras.existePalabra("hola"));
	}
	
	@Test
	void editorUnaPalabraNoBuscada() {
		assertFalse(editorUnaPalabra.existePalabra("Adios"));
	}

}
