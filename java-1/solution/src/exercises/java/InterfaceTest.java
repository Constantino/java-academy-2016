package exercises.java;

public class InterfaceTest {

	public static void main(String[] args){
		
		InterfaceExercise str = new InterfaceExercise("Hello World!");
		
		System.out.println(str.getStringBackwards());
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.subSequence(3, 7));
	}
}
