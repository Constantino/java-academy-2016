package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Queue;

public class MyCollections {

	public static void main(String[] args){
		
		Set<String> mySet = new HashSet<String>();
		mySet.add("Marisa");
		mySet.add("Jake");
		mySet.add("Kasey");
		mySet.add("Aa");
		
		loopThrough(mySet);
		
		List<String> myList = new ArrayList<String>();
		myList.add("H");
		myList.add("o");
		myList.add("l");
		myList.add("a");
		
		loopThrough(myList);
		
		Queue<String> myQueue = new LinkedList<String>();
		myQueue.add("a");
		myQueue.add("b");
		myQueue.add("c");
		myQueue.add("d");
		myQueue.add("e");
		
		loopThrough(myQueue);
		
		System.out.println("**** 2 ****");
		
		/*
		 * TreeSet Iterates in Natural Order, it does that in this case
		 * alphabetically.
		 * */
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Jake");
		tree.add("Sansa");
		tree.add("Robert");
		tree.add("Marisa");
		tree.add("Abcd");
		tree.add("Arthur");
		tree.add("Kasey");
		System.out.println(tree);
		
		/*
		 * Order depends on hashcodes, because internally creates a HasMap, hence order
		 * unpredictable.
		 * */
		Set<String> names = new HashSet<String>();
		names.add("Jake");
		names.add("Robert");
		names.add("Marisa");
		names.add("ZZ");
		names.add("Kasey");
		System.out.println(names);
		
		
		/*
		 * Ordered as added
		 * */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Jake");
		lhs.add("Robert");
		lhs.add("Marisa");
		lhs.add("ZZ");
		lhs.add("Kasey");
		System.out.println(lhs);
		
	}
	
	public static <T> void loopThrough(Collection<T> myCollection){
		
		for(T e : myCollection){
			System.out.println(e);
			
		}
		
	}
	
}
