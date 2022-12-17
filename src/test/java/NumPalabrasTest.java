
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

class NumPalabrasTest {
	
	Editor editorVacio = new Editor();
	Editor editorUnaLineaUnaPalabra = new Editor();
	Editor editorSaltoDeLinea = new Editor();
	
	@BeforeEach
	void setUp() {
		editorVacio.cargarEditor("editorVacio.txt");
		editorUnaLineaUnaPalabra.cargarEditor("editorUnaPalabra.txt");
		editorSaltoDeLinea.cargarEditor("editorSaltoDeLinea.txt");
	}

	@Test
	void editorVacio() {
		assertThrows(EmptyCollectionException.class,()->editorVacio.numPalabras());
	}
	
	@Test
	void editorUnaLineaUnaPalabra() throws EmptyCollectionException {
		assertEquals(1,editorUnaLineaUnaPalabra.numPalabras());
	}
	
	@Test
	void editorConSaltoDeLinea() throws EmptyCollectionException {
		assertEquals(0,editorSaltoDeLinea.numPalabras());
	}


}
