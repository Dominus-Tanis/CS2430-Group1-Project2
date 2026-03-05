package setOperations;
import java.util.Iterator;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class Main {
	/**
	 * TODO A String array to provide a real world Representation of the boolean arrays
	 * @author
	 */
	/**
	 * TODO Boolean arrays to perform set operations on.
	 * These should provide the main ven diagram scenerios:
	 * No Elements Common
	 * Some Elements in Common
	 * Identical Sets
	 * Set A is a subset of B
	 * @author
	 */
	/**
	 * TODO MultiSets (I would recommend Java Bags) to perform set operations on.
	 * These should provide the main ven diagram scenerios:
	 * No Elements Common
	 * Some Elements in Common
	 * Identical Sets
	 * Set A is a subset of B
	 * @author
	 */

	private static Bag<String> bag;
	public static void main(String[] args) {
		HashBag<Integer> bag1 = new HashBag<Integer>();
		bag1.add(1);
		bag1.add(2);
		bag1.add(2);
		bag1.add(3);
		
		HashBag<Integer> bag2 = new HashBag<Integer>();
		bag2.add(1);
		bag2.add(4);
		bag2.add(4);
		bag2.add(0);
		
		HashBag<Integer> bag3 = MultiSetOperations.union(new HashBag<Integer>(bag1), bag2);
		Iterator<Integer> bagIterator = bag3.iterator();
		while(bagIterator.hasNext()) {
			System.out.print(bagIterator.next()+ ", ");
		}
	}

}
