package ood.lab1.sunblockfactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab1Tests {
	
	Sunblock sunblock = new BlueSunblock();
	Sunblock strawberryScentedSunblock = new SmellySunblock(sunblock, "strawberry");
	Sunblock spf50Sunblock = new SpfSunblock(strawberryScentedSunblock, 50.0);

	@Test
	void testBlueSunblock() {
		assertEquals("Generic Sunblock, blue", sunblock.getProperties());
		assertEquals(3.2, (double) sunblock.getCost());
	}
	
	@Test
	void testScentDecorator() {		
		assertEquals("Generic Sunblock, blue, strawberry scented", strawberryScentedSunblock.getProperties());
		assertEquals(3.7, (double) strawberryScentedSunblock.getCost());
	}
	
	@Test
	void testSpfDecorator() {		
		assertEquals("Generic Sunblock, blue, strawberry scented, SPF 50.0", spf50Sunblock.getProperties());
		assertEquals(6.2, (double) spf50Sunblock.getCost());
	}
	

}
