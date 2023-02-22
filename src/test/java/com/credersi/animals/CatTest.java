package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testNineDeathRuns() {
		Cat cat = new Cat();
		for (int i = 0; i < 9; i++) {
			cat.runs();
			cat.runs();
		}
		assertFalse(cat.isAlive());
	}
	
	@Test
	public void testEightDeathRuns() {
		Cat cat = new Cat();
		for (int i = 0; i < 8; i++) {
			cat.runs();
			cat.runs();
		}
		assertTrue(cat.isAlive());
	}
	
	@Test
	public void testTaxidermy() {
		Cat cat = new Cat();
		for (int i = 0; i < 9; i++) {
			cat.runs();
			cat.runs();
		}
		cat.feeds();
		assertEquals(cat.howHungry(), 110);
		assertFalse(cat.isAlive());
	}
	// Feeding shouldn't affect hunger when the cat is dead.

}