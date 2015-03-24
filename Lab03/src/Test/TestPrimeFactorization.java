package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.PrimeFactorization;

public class TestPrimeFactorization {

	@Test
	public void testPrimeFactor() {
		assertEquals(0, PrimeFactorization.primeFactor(1).length);
		assertArrayEquals(new int[] {2}, PrimeFactorization.primeFactor(2));
	}

}
