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


	//Creates a HashMultiSet with hard coded values
		HashMultiSet<Integer> ms1 = new HashMultiSet<Integer>();
		ms1.add(1);
		ms1.add(2);
		ms1.add(2);
		ms1.add(3);
		//Creates another HashmultiSet with hard coded values
		HashMultiSet<Integer> ms2 = new HashMultiSet<Integer>();
		ms2.add(1);
		ms2.add(4);
		ms2.add(4);
		ms2.add(0);
		
		System.out.println();
		System.out.println("Returning set Addition");
		HashMultiSet<Integer> ms3 = MultiSetOperations.setAddition(ms1, ms2);
		
		Set<Integer> unique3 = ms1.uniqueSet();
		//Iterator instantiation to iterate through unique
		Iterator<Integer> iterator3 = unique3.iterator();
		while (iterator3.hasNext()) {
			//Gets element
			Integer element = iterator3.next();
			//Gets count of element
	        int count = ms3.getCount(element);
	        //Prints both element and count
	        System.out.print(element + " occurs ");
	        System.out.println(count + " times.");
		}
		
		System.out.println("Returning set Difference");
		HashMultiSet<Integer> ms4 = MultiSetOperations.setDifference(ms1, ms2);
		
		Set<Integer> unique4 = ms4.uniqueSet();
		
		Iterator<Integer> iterator4 = unique4.iterator();
		while(iterator4.hasNext()) {
			
			Integer element = iterator4.next();
			
			int count = ms4.getCount(element);
			System.out.print(element + " occurs ");
			System.out.println(count + " times.");
		}
}

