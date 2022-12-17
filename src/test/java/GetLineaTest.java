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
class GetLineaTest {
	
	private Editor editorVacio;
	private Editor editorTresLineas;
	private Editor editorUnaLinea;
	private LinkedList<String> lista;

	@BeforeEach
	void setUp() {
		editorVacio= new Editor();
		
		editorTresLineas= new Editor();
		editorTresLineas.cargarEditor("editorVariasLineas.txt");
		
		editorUnaLinea= new Editor();
		editorUnaLinea.cargarEditor("editorUnaPalabra.txt");
		
		lista= new LinkedList<>();
		lista.add("Hola");
	}
  
    
	@Test
	void editorVacio() {
		assertThrows(Exception.class,()->editorVacio.getLinea(3));
	}
	
	@Test
	void lineaMenorQueCero() {
		assertThrows(Exception.class,()->editorTresLineas.getLinea(-3));
	}
	
	@Test
	void lineaMayorQueEditor() {
		assertThrows(Exception.class,()->editorTresLineas.getLinea(4));
	}
	
	@Test
	void lineaCorrecta() throws IllegalArgumentException, EmptyCollectionException {
		boolean iguales = true;
		Iterator it1 = lista.iterator();
		Iterator it2 = editorUnaLinea.getLinea(1).iterator();
		while(it1.hasNext()) {
		    if(it2.hasNext()) {
			if(!it1.next().equals(it2.next()))
			    iguales = false;
		    }else {
			iguales = false;
		    }
		}
		if(it2.hasNext())
		    iguales = false;
		
		assertTrue(iguales);
	}

}
