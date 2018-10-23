package Practise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class FlashingTest2 {
	
	@Test
	public void testFlashingTwo() {
		
		Flashing secondFlashing = new SecondFlashing();

		assertFalse(secondFlashing.isLight());
		
	}
	
	@Test
	public void testFlashingTwoOn() {
		
		Flashing secondFlashing = new SecondFlashing();
		
		secondFlashing.on();

		assertFalse(secondFlashing.isLight());
		
	}
	
	@Test
	public void testOnBatery() {
		
		SecondFlashing secondFlashing = new SecondFlashing();
		
		secondFlashing.setBatery(new SimpleBatery());
		
		secondFlashing.on();

		assertTrue(secondFlashing.isLight());
		
	}
	
	@Test
	public void testOnBateryTwo() {
		
		SecondFlashing secondFlashing = new SecondFlashing();
		
		secondFlashing.setBatery(new DuracelBatery());
		
		secondFlashing.on();

		assertTrue(secondFlashing.isLight());
		
	}

}
