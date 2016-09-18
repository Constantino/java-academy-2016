package exercises.java;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args){

		List<String> list = new ArrayList<String>();
		list.add("hello");
		String s = list.get(0);
			
		System.out.println(s);
	}
	
}
