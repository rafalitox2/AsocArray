import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {
	
	@Test
	public void ArrayVacío(){
		AsocArray a = new AsocArray();
		assertEquals(0,a.size());
	}
}
