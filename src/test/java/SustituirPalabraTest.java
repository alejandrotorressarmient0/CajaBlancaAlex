import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

class SustituirPalabraTest {
    
    Editor editorVacio = new Editor();
    Editor editorDocumentoUnaPalabra = new Editor();
    Editor editor2LineasPrimeraVacia = new Editor();
    
    @BeforeEach
    void setUp() {
    	editorVacio.cargarEditor("editorVacio.txt");
    	editorDocumentoUnaPalabra.cargarEditor("editorUnaPalabra.txt");
    	editor2LineasPrimeraVacia.cargarEditor("editor2LineasPrimeraVacia.txt");
    }

    @Test
    void documentoVacio() {
    	editorVacio.sustituirPalabra("Hola", "Adios");
    	assertEquals(editorVacio.size(),0);
    }
    
    @Test
    void documentoUnaPalabraBuscada() throws IllegalArgumentException, EmptyCollectionException {
    	editorDocumentoUnaPalabra.sustituirPalabra("Hola", "Adios");
    	String nuevaPalabra = editorDocumentoUnaPalabra.getLinea(1).getAtPos(1);
    	assertEquals(nuevaPalabra,"Adios");
    }
    
    @Test
    void documentoUnaPalabraNoBuscada() throws IllegalArgumentException, EmptyCollectionException {
	editorDocumentoUnaPalabra.sustituirPalabra("Chao", "Adios");
	String nuevaPalabra = editorDocumentoUnaPalabra.getLinea(1).getAtPos(1);
	assertEquals(nuevaPalabra,"Hola");
    }
    
    @Test
    void documentoVariasLineas() throws IllegalArgumentException, EmptyCollectionException {
	editor2LineasPrimeraVacia.sustituirPalabra("Hola", "Adios");
	String nuevaPalabra = editor2LineasPrimeraVacia.getLinea(2).getAtPos(1);
	assertEquals(nuevaPalabra,"Adios");
    }
    
}
