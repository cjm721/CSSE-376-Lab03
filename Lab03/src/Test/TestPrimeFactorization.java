package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.OurMath;

public class TestPrimeFactorization {

	@Test
	public void testPrimeFactor() {
		assertEquals(0, OurMath.primeFactor(1).length);
		assertArrayEquals(new int[] {2}, OurMath.primeFactor(2));
		assertArrayEquals(new int[] {3} , OurMath.primeFactor(3));
		assertArrayEquals(new int[] {2,2} , OurMath.primeFactor(4));
		assertArrayEquals(new int[] {2,3} , OurMath.primeFactor(6));
		assertArrayEquals(new int[] {2,2,2} , OurMath.primeFactor(8));
		assertArrayEquals(new int[] {3,3} , OurMath.primeFactor(9));
		// Already Passing Case
		// assertArrayEquals(new int[] {5,7,7,1327} , PrimeFactorization.primeFactor(325115));
	}

}