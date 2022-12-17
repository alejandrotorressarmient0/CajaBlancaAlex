import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;


class PrintListaAdyacentesTest {
    
    PrintStream standardOut = System.out;
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    Grafo grafoUnNodo = new Grafo(); 
    Grafo grafoDosNodos = new Grafo(); 

    @BeforeEach
    public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	    grafoUnNodo.addVertice(1);
	    grafoDosNodos.addVertice(1);
	    grafoDosNodos.addVertice(2);
	    grafoDosNodos.addArco(new Arco(1,2,0));
    }

    @Test
    void grafoUnNodo() {
	grafoUnNodo.printListaAdyacentes(1);
	Assertions.assertEquals("Adyacentes de 1:", outputStreamCaptor.toString()
		      .trim());
	
    }
    
    @Test
    void grafoDosNodos() {
	grafoDosNodos.printListaAdyacentes(1);
	Assertions.assertEquals("Adyacentes de 1: 2", outputStreamCaptor.toString()
		      .trim());
    }

}
