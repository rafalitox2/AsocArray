import static org.junit.Assert.*;

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
}
