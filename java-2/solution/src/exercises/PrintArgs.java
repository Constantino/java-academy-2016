package exercises;

import java.util.*;

public class PrintArgs {

	public static void main(String[] args){
		// Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        argList.stream()
        .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }
	}
}
