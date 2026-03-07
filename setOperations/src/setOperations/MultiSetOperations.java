package setOperations;

import java.util.Iterator;

import org.apache.commons.collections4.bag.HashBag;

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
	public static <T> HashBag<T> union(HashBag<T> bag, HashBag<T> otherBag) {
		
		Iterator<T> bagIterator = otherBag.iterator();
		while(bagIterator.hasNext()) {
			bag.add(bagIterator.next());
		}
		return bag;
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
	public static <T> void setDifference(MultiSet<T> a, MultiSet<T> b) {
		
		//takes the difference between the 2 sets (A-B)
		MultiSet<T> difference = new HashMultiSet<>(CollectionUtils.subtract(a, b));
		//Creates a set of unique elements in the difference
		Set<T> unique = difference.uniqueSet();
		//Iterator instantiation to iterate through unique
		Iterator<T> iterator = unique.iterator();
		while (iterator.hasNext()) {
			//Gets element
			T element = iterator.next();
			//Gets count of element
	        int count = difference.getCount(element);
	        //Prints both element and count
	        System.out.println(element);
	        System.out.println(count);
		}
		
		
	}
	
	/**
	 * TODO sum / A + B
	 * @author Andrew
	 * Resource: https://www.geeksforgeeks.org/java/collections-addall-method-in-java-with-examples/
	 */
	public static <T> void setAddition(MultiSet<T> a, MultiSet<T> b) {
		//Creates a HashMultiSet to store the sum
				MultiSet<T> sum = new HashMultiSet<>();
				//Adds all elements of both MultiSets to sum
				sum.addAll(a);
				sum.addAll(b);
				//Creates a set of unique elements in the sum
				Set<T> unique = sum.unique;
				//Iterator instantiation to iterate through unique
				Iterator<T> iterator = unique.iterator();
				while (iterator.hasNext()) {
					//Gets element
					T element = iterator.next();
					//Gets count of element
			        int count = sum.getCount(element);
			        //Prints both element and count
			        System.out.println(element);
			        System.out.println(count);
				}
	}

}
