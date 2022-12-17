import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;

import org.junit.jupiter.api.Test;
public class NumAparicionesTest {
	
	private Editor editorVacio;
	private Editor editorTresLineas;
	private Editor editorUnaLinea;
	private Editor editorHolaDosVeces;
	private Editor editorDosLineasUnaVacia;

	@BeforeEach
	void setUp() {
		editorVacio = new Editor();
		
		editorTresLineas = new Editor();
		editorTresLineas.cargarEditor("editorVariasLineas.txt");
		
		editorUnaLinea = new Editor();
		editorUnaLinea.cargarEditor("editorUnaPalabra.txt");
		
		editorHolaDosVeces = new Editor();
		editorHolaDosVeces.cargarEditor("holaDosVeces.txt");
		
		editorDosLineasUnaVacia = new Editor();
		editorDosLineasUnaVacia.cargarEditor("dosLineasUnaVacia.txt");
	}
	
	@Test
	void inicioMenorQueCero() {
		assertThrows(Exception.class, ()-> editorUnaLinea.numApariciones(-1, 2, "Hola"));
	}
	
	@Test 
	void finMayorQueEditorSize() {
		assertThrows(Exception.class, ()-> editorTresLineas.numApariciones(1, 10, "Hola"));
	}
	
	@Test
	void palabraNula() {
		assertEquals(0, editorTresLineas.numApariciones(1, 2, null));
	}
	
	@Test 
	void inicioMayorQueFin() {
		assertEquals(0, editorTresLineas.numApariciones(3, 2, null));

	}
	
	@Test 
	void palabraDistinta(){
		assertEquals(0, editorTresLineas.numApariciones(1, 2, "Adios"));
	}
	
	@Test 
	void palabraEnEditor() {
		assertEquals(2, editorHolaDosVeces.numApariciones(1, 2, "Hola"));

	}
	
	@Test 
	void listaVacia() {
		assertEquals(0,editorDosLineasUnaVacia.numApariciones(2, 3, "Hola"));
	}
}
