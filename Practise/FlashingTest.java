package Practise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class FlashingTest {
	
	@Test
	public void testOn() {
		
		Flashing firstFlashing = new FirstFlashing(new SimpleBatery());
		firstFlashing.on();

		assertTrue(firstFlashing.isLight());
		
	}
	
	@Test
	public void testOff() {
		
		Flashing firstFlashing = new FirstFlashing(new SimpleBatery());
		firstFlashing.on();
		firstFlashing.off();

		assertFalse(firstFlashing.isLight());
		
	}
	
	@Test
	public void testDuracel() {
		
		Flashing firstFlashing = new FirstFlashing(new DuracelBatery());
		
		for (int i = 0; i < 20; i++) {
			
			firstFlashing.on();
			firstFlashing.off();
			
		}
		
		firstFlashing.on();

		assertFalse(firstFlashing.isLight());
		
	}

}
