import static org.junit.Assert.*;
import java.util.NoSuchElementException;
import org.junit.Test;

public class AsocArrayTest {

	@Test
	public void ArrayVacio(){
		AsocArray a = new AsocArray();
		assertEquals(0,a.size());
	}
	
	@Test
	public void ArrayNoVacio(){
		AsocArray a = new AsocArray("key","value");
		assertNotEquals(0, a.size());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void LlaveNoEncontradaArrayVacio(){
		AsocArray a = new AsocArray();
		String key = "key";
		a.get("key");
	}
	
	@Test
	public void BuscarValorLlaveEnArray(){
		AsocArray a = new AsocArray("key","value");
		assertEquals("value",a.get("key"));
	}
	
	@Test(expected = NoSuchElementException.class)
	public void BuscarValorDeKeySinEstarEnElArray(){
		AsocArray a = new AsocArray ("llave","valor");
		a.get("key");
	}
	
	@Test
	public void insertarParEnArrayVacío(){
		AsocArray a = new AsocArray();
		a.put("key","value");
		assertEquals("value", a.get("key"));
	}
	
	@Test
	public void insertarParEnArrayNoVacio(){
		AsocArray a = new AsocArray("llave","valor");
		int tam =a.size();
		
		a.put("key", "value");
		assertEquals("valor", a.get("llave"));
		assertEquals("value",a.get("key"));
		assertEquals(tam+1,a.size());
	}
	
	@Test
	public void insertarParModificandoValor(){
		AsocArray a = new AsocArray("llave","valor");
		int tam = a.size();
		
		a.put("llave", "nuevoValor");
		assertEquals("nuevoValor", a.get("llave"));
		assertEquals(tam,a.size());
	}
	
	@Test
	public void GetOrElseArrayVacío() {
	         AsocArray a = new AsocArray();
	         
	         assertEquals("nothing", a.getOrElse("key","nothing"));
     }
	
	@Test
	public void GetOrElselallaveExiste(){
		AsocArray a = new AsocArray("llave", "valor");
		
		assertEquals("valor", a.getOrElse("llave", "auxiliar"));
		a.put("key","prueba");
		assertEquals("prueba", a.getOrElse("key", "auxiliar"));
	}
	
	@Test
	public void GetOrLlaveNoExiste() {
		AsocArray a = new AsocArray("llave","valor");
       
        assertEquals("nada", a.getOrElse("Absoluto", "nada"));
        a.put("prueba", "Algo");
        assertEquals("nada", a.getOrElse("Absoluto", "nada"));
    }
	
	@Test
	public void ContieneKeyArrayVacio() {
        AsocArray a  = new AsocArray();
        
        assertFalse(a.containsKey("llave"));
    }
	
	@Test
	public void EliminarLlavedeArray(){
		AsocArray a = new AsocArray("llave","valor");
		a.put("prueba", "Algo");
		int tam = a.size();
		a.delete("llave");
		assertEquals(tam-1,a.size());
	}
}

