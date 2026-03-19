package setOperations;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiSetUtils;
import org.apache.commons.collections4.set.*;

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
	public static void main(String[] args) {
		
		int[] entityReferenceArry = {1,2,3,4,5,6,7,8,9,10};
		
		
		///////////////////////////////////
		/// Multi Set Outputs - Set A will contain 1-10 with doubly repeated even elements
		//////////////////////////////////
		//Defining Variables
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
		
		//Multi sets to store denoted results
		//Union
		HashMultiSet<Integer> msUnion = MultiSetOperations.union(msA, msB);
		//IntersectMin
		HashMultiSet<Integer> msInter = MultiSetOperations.intersectMin(msA, msB);
		//setDifference
		HashMultiSet<Integer> msDiff = MultiSetOperations.setDifference(msA, msB);
		//setAddition
		HashMultiSet<Integer> msAdd =MultiSetOperations.setAddition(msA, msB);
		System.out.println("*******************************MultiSet Operations*******************************");
		System.out.println("SetA: {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10}");
		System.out.println("SetB: {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}");
		System.out.println("------------Returning MultiSet Union------------");
		printMultiSet(msUnion);
		System.out.println("------------Returning MultiSet IntersectMin------------");
		printMultiSet(msInter);
		System.out.println("------------Returning MultiSet Difference------------");
		printMultiSet(msDiff);
		System.out.println("------------Returning MultiSet Addition------------");
		printMultiSet(msAdd);
		
		
	}
	
	private static void printMultiSet(HashMultiSet<Integer> multiSet) {
		Iterator<Integer> multIterator = multiSet.uniqueSet().iterator();
		while(multIterator.hasNext()) {
			
			int element = multIterator.next();
			
			System.out.print(element + " occurs ");
			System.out.println(multiSet.getCount(element) + " times.");
		}
	}
	
	
	
}
