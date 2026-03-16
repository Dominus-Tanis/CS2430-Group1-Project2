package setOperations;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiSetUtils;
import org.apache.commons.collections4.set.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultiSetOperationsTest {
	/*
	 * Contains a setup for all of the following test methods
	 * @author Andrew Clark
	 */
	//Setup for general multiset used as the "A" in which subsets compare to.  Contains evens through 20 added twice
	private HashMultiSet<Integer> msBigset = new HashMultiSet<Integer>();
	
	//Setup for multisets involving complete overlap of values - (1)
	private HashMultiSet<Integer> msSubset1 = new HashMultiSet<Integer>();
	
	//Setup for multisets involving no overlap of values - (2)
	private HashMultiSet<Integer> msSubset2 = new HashMultiSet<Integer>();
	
	//Setup for multisets involving some overlap of values - (3)
	private HashMultiSet<Integer> msSubset3 = new HashMultiSet<Integer>();
	
	//Setup for multisets involving empty subset - (4)
	private HashMultiSet<Integer> msSubset4 = new HashMultiSet<Integer>();
	
	//Setup for multisets involving subset with large number of duplicates for a single value - (5)
	private HashMultiSet<Integer> msSubset5 = new HashMultiSet<Integer>();
	
	@BeforeEach
	void setUp() {
	    msBigset = new HashMultiSet<>();
	    msSubset1 = new HashMultiSet<>();
	    msSubset2 = new HashMultiSet<>();
	    msSubset3 = new HashMultiSet<>();
	    msSubset4 = new HashMultiSet<>();
	    msSubset5 = new HashMultiSet<>();
		
		
		//Insert elements into msBigset
		msBigset.add(2);
		msBigset.add(4);
		msBigset.add(6);
		msBigset.add(8);
		msBigset.add(10);
		msBigset.add(12);
		msBigset.add(14);
		msBigset.add(16);
		msBigset.add(18);
		msBigset.add(20);
		msBigset.add(2);
		msBigset.add(4);
		msBigset.add(6);
		msBigset.add(8);
		msBigset.add(10);
		msBigset.add(12);
		msBigset.add(14);
		msBigset.add(16);
		msBigset.add(18);
		msBigset.add(20);
		
		//Insert elements into subset1
		msSubset1.add(2);
		msSubset1.add(4);
		msSubset1.add(6);
		msSubset1.add(8);
		msSubset1.add(10);
		msSubset1.add(12);
		msSubset1.add(14);
		msSubset1.add(16);
		msSubset1.add(18);
		msSubset1.add(20);
		msSubset1.add(2);
		msSubset1.add(4);
		msSubset1.add(6);
		msSubset1.add(8);
		msSubset1.add(10);
		msSubset1.add(12);
		msSubset1.add(14);
		msSubset1.add(16);
		msSubset1.add(18);
		msSubset1.add(20);
		
		//Insert elements into subset2
		msSubset2.add(1);
		msSubset2.add(3);
		msSubset2.add(5);
		
		//Insert elements into subset3
		msSubset3.add(2);
		msSubset3.add(4);
		msSubset3.add(6);
		
		
		msSubset5.add(2);
		msSubset5.add(2);
		msSubset5.add(2);
		msSubset5.add(2);
		

	
	}
	

	//===================================================
	//MSUNION TESTS
	//===================================================
	
	/*
	 * Test to check MultiSetUnion operation returning msBigset in the case of subset being identical to original
	 * Expected will hold entire msBigset
	 */
	@Test
	void MSUnion_Test_Duplicate() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.union(msBigset, msSubset1);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiSetUnion operation in case of subset being completely unique to original
	 * Expected will hold entire msBigset + integers 1, 3 and 5
	 * Note that this is the same operation as MSAddition for this particular test case
	 */
	@Test
	void MSUnion_Test_Unique() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		expected.add(1);
		expected.add(3);
		expected.add(5);
		HashMultiSet<Integer> actual = MultiSetOperations.union(msBigset, msSubset2);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiSetUnion operation in case of subset being a Proper Subset of the original
	 * Expected will hold entire msBigse
	 */
	@Test
	void MSUnion_Test_Proper_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.union(msBigset, msSubset3);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiUnion operation in case of subset being empty
	 * Expected will hold entire msBigset
	 */
	@Test
	void MSUnion_Test_Null_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.union(msBigset, msSubset4);
		
		assertEquals(expected, actual);	
	}
	/*
	 * Test to check MultiSetUnion operation in case of subset containing 4 duplicates of the same element
	 * Expected will contain msBigset but with 4 instances of the integer 2 instead of 2 instances of the integer 2
	 * Note: this is a key test as it represents the main difference between addition and union for multisets
	 */
	@Test
	void MSUnion_Test_Multiple_Duplicates_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		expected.add(4);
		expected.add(4);
		expected.add(6);
		expected.add(6);
		expected.add(8);
		expected.add(8);
		expected.add(10);
		expected.add(10);
		expected.add(12);
		expected.add(12);
		expected.add(14);
		expected.add(14);
		expected.add(16);
		expected.add(16);
		expected.add(18);
		expected.add(18);
		expected.add(20);
		expected.add(20);
		HashMultiSet<Integer> actual = MultiSetOperations.union(msBigset, msSubset5);
		assertEquals(expected, actual);
		
		
	}
	
	//===================================================
	//MSINTERSECT TESTS
	//===================================================
	
	/*
	 * Test to check MultiSetIntersection operation returning original if subset is a duplicate of original
	 * Expected will be identical to msBigset
	 */
	
	/**@Test
	void MSIntersect_Test_Duplicate() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.setIntersect(msBigset, msSubset1);
		
		assertEquals(expected, actual);	
	}
	**/
	
	/*
	 * Test to check MultiSetIntersection operation in case of subset being completely unique to original
	 * Expected will be empty
	 */
	/**
	@Test
	void MSIntersect_Test_Unique() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		HashMultiSet<Integer> actual = MultiSetOperations.setIntersect(msBigset, msSubset2);
		
		assertEquals(expected, actual);	
	}
	**/
	
	/*
	 * Test to check MultiSetIntersection operation in case of subset being a Proper Subset of the original
	 * Expected be identical to the subset
	 */
	/**
	@Test
	void MSIntersect_Test_Proper_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msSubset3);
		HashMultiSet<Integer> actual = MultiSetOperations.setIntersect(msBigset, msSubset3);
		
		assertEquals(expected, actual);	
	}
	**/
	
	/*
	 * Test to check MultiSetDifference operation in case of subset being empty
	 * Expected will be empty
	 */
	/*
	 /**
	@Test
	void MSIntersect_Test_Null_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		HashMultiSet<Integer> actual = MultiSetOperations.setIntersect(msBigset, msSubset4);
		
		assertEquals(expected, actual);	
	}
	**/
	
	//===================================================
	//MSDIFFERENCE TESTS
	//===================================================
	
	/*
	 * Test to check MultiSetDifference operation returning empty set in case of subset being a duplicate to original
	 */
	@Test
	void MSDifference_Test_Duplicate() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		HashMultiSet<Integer> actual = MultiSetOperations.setDifference(msBigset, msSubset1);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiSetDifference operation in case of subset being completely unique to original
	 * Expected will hold entire msBigset
	 */
	@Test
	void MSDifference_Test_Unique() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.setDifference(msBigset, msSubset2);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiSetDifference operation in case of subset being a Proper Subset of the original
	 * Expected will contain just one instance of 2, 4, 6 and 8 plus the even numbers >= 8 and <=20 each represented twice
	 */
	@Test
	void MSDifference_Test_Proper_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.add(2);
		expected.add(4);
		expected.add(6);
		expected.add(8);
		expected.add(10);
		expected.add(12);
		expected.add(14);
		expected.add(16);
		expected.add(18);	
		expected.add(20);
		expected.add(8);
		expected.add(10);
		expected.add(12);
		expected.add(14);
		expected.add(16);
		expected.add(18);	
		expected.add(20);
		HashMultiSet<Integer> actual = MultiSetOperations.setDifference(msBigset, msSubset3);
		
		assertEquals(expected, actual);	
	}
	
	/*
	 * Test to check MultiSetDifference operation in case of subset being empty
	 * Expected will hold entire msBigset
	 */
	@Test
	void MSDifference_Test_Null_Subset() {
		HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
		expected.addAll(msBigset);
		HashMultiSet<Integer> actual = MultiSetOperations.setDifference(msBigset, msSubset4);
		
		assertEquals(expected, actual);	
	}
	
	//===================================================
	//MSADDITION TESTS
	//===================================================
		
		/*
		 * Test to check MultiSetAddition operation returning doubled values in the case of the subset being the same as the original
		 */
		@Test
		void MSAddition_Test_Duplicate() {
			HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
			expected.addAll(msBigset);
			expected.addAll(msBigset);
			HashMultiSet<Integer> actual = MultiSetOperations.setAddition(msBigset, msSubset1);
			
			assertEquals(expected, actual);	
		}
		
		/*
		 * Test to check MultiSetAddition operation in case of subset being completely unique to original
		 * Expected will hold entire msBigset + integers 1, 3 and 5
		 */
		@Test
		void MSAddition_Test_Unique() {
			HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
			expected.addAll(msBigset);
			expected.add(1);
			expected.add(3);
			expected.add(5);
			HashMultiSet<Integer> actual = MultiSetOperations.setAddition(msBigset, msSubset2);
			
			assertEquals(expected, actual);	
		}
		
		/*
		 * Test to check MultiSetAddition operation in case of subset being a Proper Subset of the original
		 * Expected will hold entire msBigset + integers 2, 4 and 6
		 */
		@Test
		void MSAddition_Test_Proper_Subset() {
			HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
			expected.addAll(msBigset);
			expected.add(2);
			expected.add(4);
			expected.add(6);
			HashMultiSet<Integer> actual = MultiSetOperations.setAddition(msBigset, msSubset3);
			
			assertEquals(expected, actual);	
		}
		
		/*
		 * Test to check MultiSetAddition operation in case of subset being empty
		 * Expected will hold entire msBigset
		 */
		@Test
		void MSAddition_Test_Null_Subset() {
			HashMultiSet<Integer> expected = new HashMultiSet<Integer>();
			expected.addAll(msBigset);
			HashMultiSet<Integer> actual = MultiSetOperations.setAddition(msBigset, msSubset4);
			
			assertEquals(expected, actual);	
		}
		
	


}
