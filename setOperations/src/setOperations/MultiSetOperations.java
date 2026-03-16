package setOperations;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.multiset.HashMultiSet;

/**
 * 
 */
public class MultiSetOperations {
	/**
	 * unionMax / A union B
	 * Modifies the first bag to be a union of the first and second bag and returns it.
	 * @param bag - The first bag
	 * @param otherBag - The second bag to be added to the first
	 * @return A bag that has had the union operation completed on it.
	 * @author SpencerJPeck
	 */
	public static <T> HashMultiSet<T> union(HashMultiSet<T> ms1, HashMultiSet<T> ms2) {
		
		HashMultiSet<T> union = new HashMultiSet<>(CollectionUtils.union(ms1, ms2));
		return union;
	}
	/**
	 * TODO interesectMin / A bridge B
	 * @author Mike
	 */
	/**
	 * TODO difference / A - B
	 * @author Andrew
	 * Resource: https://github.com/apache/commons-collections/blob/master/src/main/java/org/apache/commons/collections4/MultiSet.java
	 */
	public static <T> HashMultiSet<T> setDifference(HashMultiSet<T> a, HashMultiSet<T> b) {
		
		//takes the difference between the 2 sets (A-B)
		HashMultiSet<T> difference = new HashMultiSet<>(CollectionUtils.subtract(a, b));
		return difference;
		
	}
	
	/**
	 * TODO sum / A + B
	 * @author Andrew
	 * Resource: https://www.geeksforgeeks.org/java/collections-addall-method-in-java-with-examples/
	 */
	public static <T> HashMultiSet<T> setAddition(MultiSet<T> a, MultiSet<T> b) {
		//Creates a HashMultiSet to store the sum
				HashMultiSet<T> sum = new HashMultiSet<>();
				//Adds all elements of both MultiSets to sum
				sum.addAll(a);
				sum.addAll(b);
				//Creates a set of unique elements in the sum
				return sum;
				
				}
	

}
