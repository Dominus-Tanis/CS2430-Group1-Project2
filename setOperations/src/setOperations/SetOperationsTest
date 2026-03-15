package setOperations;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetOperationsTest {
	
	//Setup for general set used as the "A" in which subsets compare to.  Contains alternating true and false to 10 items starting with false
	private boolean[] bigArray = new boolean [10];
		
	//Setup for sets involving complete overlap of values - (1)
	private boolean[] a1 = new boolean[10];
		
	//Setup for sets involving no overlap of values - (2)
	private boolean[] a2 = new boolean[10];
		
	//Setup for sets involving some overlap of values (proper subset) - (3)
	private boolean[] a3 = new boolean[10];
		
	//Setup for sets involving empty subset - (4)
	private boolean[] a4 = new boolean[10];


	@BeforeEach
	void setUp() throws Exception {
		bigArray = new boolean [10];
		
		a1 = new boolean[10];
		a2 = new boolean[10];
		a3 = new boolean[10];
		a4 = new boolean[10];
		
		//Insert elements into bigArray
		bigArray[0] = false;
		bigArray[1] = true;
		bigArray[2] = false;
		bigArray[3] = true;
		bigArray[4] = false;
		bigArray[5] = true;
		bigArray[6] = false;
		bigArray[7] = true;
		bigArray[8] = false;
		bigArray[9] = true;
		
		//Insert elements into subset1
		a1[0] = false;
		a1[1] = true;
		a1[2] = false;
		a1[3] = true;
		a1[4] = false;
		a1[5] = true;
		a1[6] = false;
		a1[7] = true;
		a1[8] = false;
		a1[9] = true;
		
		//Insert elements into subset2
		a2[0] = true;
		a2[1] = false;
		a2[2] = true;
		a2[3] = false;
		a2[4] = true;
		a2[5] = false;
		a2[6] = true;
		a2[7] = false;
		a2[8] = true;
		a2[9] = false;
		
		//Insert elements into subset3
		a3[0] = false;
		a3[1] = true;
		a3[2] = false;
		a3[3] = true;
		a3[4] = false;
		
		

	}
	
	//===================================================
	//SETCOMPLEMENT TESTS
	//===================================================
	/*
	 * Tests to see whether complement inverts the values of each item
	 * Expected contains alternating True and False values starting at true
	 */
	@Test
	void set_complement() {
		boolean[] expected = new boolean[10];
		expected[0] = true;
		expected[1] = false;
		expected[2] = true;
		expected[3] = false;
		expected[4] = true;
		expected[5] = false;
		expected[6] = true;
		expected[7] = false;
		expected[8] = true;
		expected[9] = false;
		
		boolean[] actual = SetOperations.complementNot(bigArray);
		assertArrayEquals(expected, actual);
		
	}
	
	
	//===================================================
	//SETUNION TESTS
	//===================================================
	/*
	 * Tests Union with identical subset
	 * Expected will contain the original set
	 */
	@Test
	void set_union_identical() {
		boolean[] expected = bigArray.clone();
		
		boolean[] actual = SetOperations.union(bigArray, a1);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Test Union with unique subset
	 * Expected will contain all true
	 */
	@Test
	void set_union_unique() {
		boolean[] expected = new boolean[10];
		for (int i=0; i<expected.length; i++) {
			expected[i] = true;
		}
		
		boolean[] actual = SetOperations.union(bigArray, a2);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Union with proper subset
	 * Expected will contain bigArray
	 */
	@Test
	void set_union_proper_subset() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.union(bigArray, a3);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Union with an empty subset
	 * Expected will contain bigArray
	 */
	@Test
	void set_union_empty_subset() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.union(bigArray, a4);
		assertArrayEquals(expected, actual);
	}
	
	
	
	//===================================================
	//SETINTERSECT TESTS
	//===================================================
	
	/*
	 * Tests Intersect with identical subset
	 * Expected will contain the original set
	 */
	@Test
	void set_intersect_identical() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.intersect(bigArray, a1);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Test Intersect with unique subset
	 * Expected will contain an empty set
	 */
	@Test
	void set_intersect_unique() {
		boolean[] expected = new boolean[10];
		
		boolean [] actual = SetOperations.intersect(bigArray, a2);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Intersect with proper subset
	 * Expected will contain the proper subset
	 */
	@Test
	void set_intersect_proper_subset() {
		boolean[] expected = a3.clone();
		
		boolean [] actual = SetOperations.intersect(bigArray, a3);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Intersect with an empty subset
	 * Expected will contain an empty set
	 */
	@Test
	void set_intersect_empty_subset() {
		boolean[] expected = new boolean[10];
		
		boolean [] actual = SetOperations.intersect(bigArray, a4);
		assertArrayEquals(expected, actual);
	}
	
	//===================================================
	//SETDIFFERENCE TESTS
	//===================================================
	
	/*
	 * Tests Difference with identical subset
	 * Expected will be an empty set
	 */
	@Test
	void set_difference_identical() {
		boolean[] expected = new boolean[10];
		
		boolean [] actual = SetOperations.difference(bigArray, a1);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Test Difference with unique subset
	 * Expected will contain bigArray
	 */
	@Test
	void set_difference_unique() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.difference(bigArray, a2);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Difference with proper subset
	 * Expected will contain bigArray but with false in place of any overlapping values
	 */
	@Test
	void set_difference_proper_subset() {
		boolean[] expected = new boolean[10];
		expected[0] = false;
		expected[1] = false;
		expected[2] = false;
		expected[3] = false;
		expected[4] = false;
		expected[5] = true;
		expected[6] = false;
		expected[7] = true;
		expected[8] = false;
		expected[9] = true;
		
		
		boolean [] actual = SetOperations.difference(bigArray, a3);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests Difference with an empty subset
	 * Expected will contain bigArray
	 */
	@Test
	void set_difference_empty_subset() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.difference(bigArray, a4);
		assertArrayEquals(expected, actual);
	}
	
	//===================================================
	//SETSYMMETRIC-DIFFERENCE TESTS
	//===================================================
	/*
	 * Tests SymmetricDifference with identical subset
	 * Expected will contain all false
	 */
	@Test
	void set_sdifference_identical() {
		boolean[] expected = new boolean[10];
		for (int i = 0; i < expected.length; i++) {
			expected[i] = false;
		}
		
		boolean [] actual = SetOperations.symmetricDifference(bigArray, a1);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Test SymmetricDifference with unique subset
	 * Expected will contain all true values
	 */
	@Test
	void set_sdifference_unique() {
		boolean[] expected = new boolean[10];
		for (int i = 0; i < expected.length; i++) {
			expected[i] = true;
		}
		
		boolean [] actual = SetOperations.symmetricDifference(bigArray, a2);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests SymmetricDifference with proper subset
	 * Expected will contain a set of false in elements 1-5 and then alternating true and false for 6-10
	 */
	@Test
	void set_sdifference_proper_subset() {
		boolean[] expected = new boolean[10];
		expected[0] = false;
		expected[1] = false;
		expected[2] = false;
		expected[3] = false;
		expected[4] = false;
		expected[5] = true;
		expected[6] = false;
		expected[7] = true;
		expected[8] = false;
		expected[9] = true;
		
		boolean [] actual = SetOperations.symmetricDifference(bigArray, a3);
		assertArrayEquals(expected, actual);
	}
	/*
	 * Tests sdifference with an empty subset
	 * Expected will contain bigArray
	 */
	@Test
	void set_sdifference_empty_subset() {
		boolean[] expected = bigArray.clone();
		
		boolean [] actual = SetOperations.symmetricDifference(bigArray, a4);
		assertArrayEquals(expected, actual);
	}
}
