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
	 */
	/**
	 * TODO sum / A + B
	 * @author Andrew
	 */

}
