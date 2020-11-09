package gcLab18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindingPrimes_Test {

	//take in a number(int)
	// take in 1 --> 2
	// take in 10 --> 29
	
	@Test
	void testIsPrime() {
		
		boolean expected = true;
		
		boolean actual = FindingPrimes.isPrime(29);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testIsPrime2() {
		
		boolean expected = false;
		
		boolean actual = FindingPrimes.isPrime(100);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testIsPrime3() {
		
		boolean expected = false;
		
		boolean actual = FindingPrimes.isPrime(1);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testPrimeNumber1() {
		
		 int expected = 29;
		
		 int actual = FindingPrimes.primeNumber(10);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testPrimeNumber2() {
		
		int expected = 2;
		
		int actual = FindingPrimes.primeNumber(1);
		
		assertEquals(expected,actual);
		
	}

}
