import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

class PalabraMasLargaTest {
    
    Editor editorDocumentoVacio = new Editor();
    Editor editorDocumento2PalabrasPrimeraMenor = new Editor();
    Editor editorDocumento2PalabrasPrimeraMayor = new Editor();
    Editor editorDocumento1Linea1Palabra = new Editor();
    
    @BeforeEach
    void setUp() {
	editorDocumentoVacio.cargarEditor("editorVacio.txt");
	editorDocumento2PalabrasPrimeraMenor.cargarEditor("editor2PalabrasPrimeraMenor.txt");
	editorDocumento2PalabrasPrimeraMayor.cargarEditor("editor2PalabrasPrimeraMayor.txt");
	editorDocumento1Linea1Palabra.cargarEditor("editorUnaPalabra.txt");
    }

    @Test
    void documentoVacio() throws EmptyCollectionException{
	String palabraMasLarga = editorDocumentoVacio.palabraMasLarga();	
	assertEquals(palabraMasLarga,null);
    }
    
    @Test
    void documentoUnaPalabra() throws EmptyCollectionException {
	String palabraMasLarga = editorDocumento1Linea1Palabra.palabraMasLarga();
	assertEquals(palabraMasLarga, "Hola");
    }
    
    @Test
    void documento2PalabrasPrimeraMenor() throws EmptyCollectionException {
	String palabraMasLarga = editorDocumento2PalabrasPrimeraMenor.palabraMasLarga();
	assertEquals(palabraMasLarga, "aguacate");
    }
    
    @Test
    void documento2PalabrasPrimeraMayor() throws EmptyCollectionException {
	String palabraMasLarga = editorDocumento2PalabrasPrimeraMayor.palabraMasLarga();
	assertEquals(palabraMasLarga,"aguacate");
    }

}
