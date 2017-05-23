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
	
	public void BuscarValorLlaveEnArray(){
		AsocArray a = new AsocArray("key","value");
		assertEquals("value",a.get("key"));
	}
}
