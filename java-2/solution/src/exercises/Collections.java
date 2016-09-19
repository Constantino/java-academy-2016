package exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.Queue;


public class Collections {

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
	}
	
	public static <T> void loopThrough(Iterable<T> myCollection){
		
		for(T e : myCollection){
			System.out.println(e);
			
		}
		
	}
	
}
