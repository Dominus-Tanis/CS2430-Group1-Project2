package setOperations;

/**
 * Implements ordinary set operations using boolean arrays.
 * Every position in the array corresponds to an element in the universal set.
 * A 'true' value means the element is present in the subset.
 * * Logic based on standard bitwise and boolean array set theory 
 * Source: concepts from GeeksforGeeks.
 */
public class SetOperations {

	/**
	 * complement Not / NOT(A) 
	 * All elements in the universal set that are not in subset A.
	 * Flips all values in the boolean array.
	 * @author Kevin
	 */
	public static boolean[] complementNot(boolean[] a) {
		boolean[] result = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = !a[i];
		}
		return result;
	}

	/**
	 * union: A union B
	 * All elements in A and B added together.
	 * Logical: An element is in the union if it is in A OR B.
	 * @author Kevin
	 */
	public static boolean[] union(boolean[] a, boolean[] b) {
		boolean[] result = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] || b[i];
		}
		return result;
	}

	/**
	 * intersect A and B
	 * All elements that appear in both A and B.
	 * Logical: An element is in the intersection if it is in A AND B.
	 * @author Kevin
	 */
	public static boolean[] intersect(boolean[] a, boolean[] b) {
		boolean[] result = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] && b[i];
		}
		return result;
	}

	/**
	 * difference: A - B
	 * All elements in A excluding elements that appear in B.
	 * Logical: True if the element is in A but NOT in B.
	 * @author Kevin
	 */
	public static boolean[] difference(boolean[] a, boolean[] b) {
		boolean[] result = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] && !b[i];
		}
		return result;
	}

	/**
	 * symmetricDifference: A (+) B
	 * All elements that appear in A or B but not in both.
	 * Logical: True if the element is in exactly one of the sets.
	 * @author Kevin
	 */
	public static boolean[] symmetricDifference(boolean[] a, boolean[] b) {
		boolean[] result = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i] ^ b[i];
		}
		return result;
	}
}
