package setOperations;
import java.util.Iterator;
import org.apache.commons.collections4.multiset.HashMultiSet;

public class Main {
	
	// ==========================================================
	// PART 1 VARIABLES (ORDINARY SETS)
	// ==========================================================
	/**
	 * A String array to provide a real world Representation of the boolean arrays.
	 * Using a universal set of n >= 10 elements (Fruits).
	 * @author Kevin
	 */
	public static String[] universalSet = {
			"Apple", "Banana", "Orange", "Mango", "Grapes", 
			"Pineapple", "Strawberry", "Watermelon", "Kiwi", "Peach"
	};

	/**
	 * Boolean arrays to perform set operations on.
	 * @author Kevin
	 */
	public static boolean[] boolSetA = {true, true, false, false, true, false, false, false, true, false};
	public static boolean[] boolSetB = {false, true, true, false, false, true, false, false, false, false};
	public static boolean[] boolSetC = {true, false, true, false, true, true, false, true, false, true};
	public static boolean[] boolSetT = {true, true, true, true, true, true, true, true, true, true};

	
	public static void main(String[] args) {
		
		// ==========================================================
		// PART 1: ORDINARY SET OPERATIONS OUTPUT
		// ==========================================================
		System.out.println("*******************************Ordinary Set Operations*******************************\n");
		
		printSet("All Elements", boolSetT, universalSet);
	
		printSet("Set A", boolSetA, universalSet);
		printSet("Set B", boolSetB, universalSet);
		printSet("Set C", boolSetC, universalSet);

		printSet("NOT(A) / Complement of A", SetOperations.complementNot(boolSetA), universalSet);
		printSet("NOT(B) / Complement of B", SetOperations.complementNot(boolSetB), universalSet);
		System.out.println("\n");
		
		printSet("A U B / Union", SetOperations.union(boolSetA, boolSetB), universalSet);
		printSet("A U C / Union", SetOperations.union(boolSetA, boolSetC), universalSet);
		System.out.println("\n");
		
		printSet("A ∩ B / Intersection", SetOperations.intersect(boolSetA, boolSetB), universalSet);
		printSet("A ∩ C / Intersection", SetOperations.intersect(boolSetA, boolSetC), universalSet);
		System.out.println("\n");
		
		printSet("A - B / Difference", SetOperations.difference(boolSetA, boolSetB), universalSet);
		printSet("A - C / Difference", SetOperations.difference(boolSetA, boolSetC), universalSet);
		System.out.println("\n");
		
		printSet("A (+) B / Symmetric Difference", SetOperations.symmetricDifference(boolSetA, boolSetB), universalSet);
		printSet("A (+) B / Symmetric Difference", SetOperations.symmetricDifference(boolSetA, boolSetC), universalSet);
		
		System.out.println("\n");
		
		// ==========================================================
		// PART 2: MULTISET OPERATIONS OUTPUT
		// ==========================================================
		
		
		///////////////////////////////////
		/// Multi Set Outputs - 
		//////////////////////////////////
		//Defining Variables
		//Set A will contain 1-10 with doubly repeated even elements
		HashMultiSet<Integer> msA = new HashMultiSet<Integer>();
		msA.add(1);
		msA.add(2);
		msA.add(2);
		msA.add(3);
		msA.add(4);
		msA.add(4);
		msA.add(5);
		msA.add(6);
		msA.add(6);
		msA.add(7);
		msA.add(8);
		msA.add(8);
		msA.add(9);
		msA.add(10);
		msA.add(10);
		//Set B will contain 1-5 with all elements repeated twice
		HashMultiSet<Integer> msB = new HashMultiSet<Integer>();
		msB.add(1);
        msB.add(2);
		msB.add(3);
		msB.add(4);
		msB.add(5);
		msB.add(1);
        msB.add(2);
		msB.add(3);
		msB.add(4);
		msB.add(5);
		
		//Set C Will contain the odd elements between 1-10 repeated 3 times
		HashMultiSet<Integer> msC = new HashMultiSet<Integer>();
		msC.add(1);
        msC.add(3);
		msC.add(5);
		msC.add(7);
		msC.add(9);
		msC.add(1);
        msC.add(3);
		msC.add(5);
		msC.add(7);
		msC.add(9);
		msC.add(1);
        msC.add(3);
		msC.add(5);
		msC.add(7);
		msC.add(9);
		
		//Set D Will contain the even elements between 1-10 repeated 3 times
		HashMultiSet<Integer> msD = new HashMultiSet<Integer>();
		msD.add(2);
        msD.add(4);
		msD.add(6);
		msD.add(8);
		msD.add(10);
		msD.add(2);
        msD.add(4);
		msD.add(6);
		msD.add(8);
		msD.add(10);
		msD.add(2);
        msD.add(4);
		msD.add(6);
		msD.add(8);
		msD.add(10);
		
		System.out.println("*******************************MultiSet Operations*******************************");
		

		System.out.println();
		///////////////////////////////////
		/// SETS
		//////////////////////////////////
		System.out.println("------------Set Definitions------------");
		System.out.print("SetA: ");
		printMultiSet(msA);

		System.out.print("SetB: ");
		printMultiSet(msB);
		
		System.out.print("SetC: ");
		printMultiSet(msC);

		System.out.print("SetD: ");
		printMultiSet(msD);
		System.out.println();
		

		///////////////////////////////////
		/// UNION
		//////////////////////////////////
		System.out.println("\n============         UNION TESTS             ============\n");
		System.out.println("------------         Union Test 1             ------------");
		System.out.println("------------Multisets used for MultiSet Union------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetB: ");
		printMultiSet(msB);
		System.out.println("------------Returning MultiSet Union------------");
		System.out.print("Set Union: ");
		printMultiSet(MultiSetOperations.union(msA, msB));
		System.out.println();

		System.out.println("------------         Union Test 2             ------------");
		System.out.println("------------Multisets used for MultiSet Union------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetC: ");
		printMultiSet(msC);
		System.out.println("------------Returning MultiSet Union------------");
		System.out.print("Set Union: ");
		printMultiSet(MultiSetOperations.union(msA, msC));
		System.out.println();

		System.out.println("------------         Union Test 3             ------------");
		System.out.println("------------Multisets used for MultiSet Union------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetD: ");
		printMultiSet(msD);
		System.out.println("------------Returning MultiSet Union------------");
		System.out.print("Set Union: ");
		printMultiSet(MultiSetOperations.union(msA, msD));
		System.out.println();
		

		///////////////////////////////////
		/// INTERSECTION
		//////////////////////////////////
		System.out.println("\n============          INTERSECTION TESTS             ============\n");
		System.out.println("------------          Intersection Test 1            ------------");
		System.out.println("------------Multisets used for MultiSet Intersection------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetB: ");
		printMultiSet(msB);
		System.out.println("------------Returning MultiSet Intersection------------");
		System.out.print("Set Intersection: ");
		printMultiSet(MultiSetOperations.intersectMin(msA, msB));
		System.out.println();

		System.out.println("------------          Intersection Test 2            ------------");
		System.out.println("------------Multisets used for MultiSet Intersection------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetC: ");
		printMultiSet(msC);
		System.out.println("------------Returning MultiSet Intersection------------");
		System.out.print("Set Intersection: ");
		printMultiSet(MultiSetOperations.intersectMin(msA, msC));
		System.out.println();
		

		System.out.println("------------          Intersection Test 3            ------------");
		System.out.println("------------Multisets used for MultiSet Intersection------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetD: ");
		printMultiSet(msD);
		System.out.println("------------Returning MultiSet Intersection------------");
		System.out.print("Set Intersection: ");
		printMultiSet(MultiSetOperations.intersectMin(msA, msD));
		System.out.println();
		

		///////////////////////////////////
		/// DIFFERENCE
		//////////////////////////////////
		System.out.println("\n============          DIFFERENCE TESTS             ============\n");
		System.out.println("------------          Difference Test 1            ------------");
		System.out.println("------------Multisets used for MultiSet Difference------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetB: ");
		printMultiSet(msB);
		System.out.println("------------Returning MultiSet Difference------------");
		System.out.print("Set Difference: ");
		printMultiSet(MultiSetOperations.setDifference(msA, msB));
		System.out.println();

		System.out.println("------------          Difference Test 2            ------------");
		System.out.println("------------Multisets used for MultiSet Difference------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetC: ");
		printMultiSet(msC);
		System.out.println("------------Returning MultiSet Difference------------");
		System.out.print("Set Difference: ");
		printMultiSet(MultiSetOperations.setDifference(msA, msC));
		System.out.println();


		System.out.println("------------          Difference Test 3            ------------");
		System.out.println("------------Multisets used for MultiSet Difference------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetD: ");
		printMultiSet(msD);
		System.out.println("------------Returning MultiSet Difference------------");
		System.out.print("Set Difference: ");
		printMultiSet(MultiSetOperations.setDifference(msA, msD));
		System.out.println();
		

		
		///////////////////////////////////
		/// ADDITION
		//////////////////////////////////
		System.out.println("\n============          ADDITION TESTS             ============\n");
		System.out.println("------------          Addition Test 1            ------------");
		System.out.println("------------Multisets used for MultiSet Addition------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetB: ");
		printMultiSet(msB);
		System.out.println("------------Returning MultiSet Addition------------");
		System.out.print("Set Addition: ");
		printMultiSet(MultiSetOperations.setAddition(msA, msB));
		System.out.println();
		
		System.out.println("------------          Addition Test 2            ------------");
		System.out.println("------------Multisets used for MultiSet Addition------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetC: ");
		printMultiSet(msC);
		System.out.println("------------Returning MultiSet Addition------------");
		System.out.print("Set Addition: ");
		printMultiSet(MultiSetOperations.setAddition(msA, msC));
		System.out.println();
		
		System.out.println("------------          Addition Test 3            ------------");
		System.out.println("------------Multisets used for MultiSet Addition------------");
		System.out.print("SetA: ");
		printMultiSet(msA);
		System.out.print("SetD: ");
		printMultiSet(msD);
		System.out.println("------------Returning MultiSet Addition------------");
		System.out.print("Set Addition: ");
		printMultiSet(MultiSetOperations.setAddition(msA, msD));
		System.out.println();
		
	}
	
	// ==========================================================
	// HELPER METHODS 
	// ==========================================================

	/**
	 * HELPER METHOD
	 * Prints out the contents of the HashMultiSet.
	 * @author SpencerJPeck
	 */
	private static void printMultiSet(HashMultiSet<Integer> multiSet) {
		Iterator<Integer> multIterator = multiSet.uniqueSet().iterator();
		while(multIterator.hasNext()) {
			
			int element = multIterator.next();
			
			System.out.print("\""+ element + "\" occurs ");
			System.out.print(multiSet.getCount(element) + " times. ");
		}
		System.out.println();
	}
	
	/**
	 * HELPER METHOD
	 * Helper method to cleanly display an ordinary set's boolean array and its corresponding string elements.
	 * Logic pattern for array mapping is a standard technique (Source: basic Java tutorials like GeeksforGeeks).
	 * @param label The name of the operation being displayed.
	 * @param boolArray The boolean array result of the set operation.
	 * @param universalSet The master array of string elements.
	 */
	public static void printSet(String label, boolean[] boolArray, String[] universalSet) {
		System.out.println("--- " + label + " ---");
		
		// 1. Print the Boolean Array (Bit String Representation)
		System.out.print("Boolean Array: [");
		for (int i = 0; i < boolArray.length; i++) {
			System.out.print(boolArray[i] + (i < boolArray.length - 1 ? ", " : ""));
		}
		System.out.println("]");
		
		// 2. Print the Element-Name Listing
		System.out.print("Elements: {");
		boolean first = true;
		for (int i = 0; i < boolArray.length; i++) {
			if (boolArray[i]) {
				if (!first) System.out.print(", ");
				System.out.print(universalSet[i]);
				first = false;
			}
		}
		System.out.println("}\n");
	}
}
