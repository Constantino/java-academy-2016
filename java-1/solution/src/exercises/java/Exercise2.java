package exercises.java;

public class Exercise2 {
	
	public static int var1 = 10; //class scope
	
	//Primitive variables
	private static byte b;
	private static short s;
	private static int i;
	private static long l;
	private static float f;
	private static double d;
	private static boolean bo;
	private static char c;
	
	public static void main(String[] args){
		int var2 = 15;//method scope
		
		for(int i = 0; i < var2; i++){
			int var3 = 20; //loop scope
		}
		
		handlePrimitive();
		handleOperators();
		handleArrays(5);
	}
	
	public static void handlePrimitive(){
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bo);
		System.out.println(c);
		
	}
	
	public static void handleOperators(){
		//Math
		i = i + 5;
		i = i - 1;
		i = i * 3;
		i = i / 4;
		i = i%2;
		i++;
		i--;
		
		//Assignment
		i = 10;
		i += 5;
		i -= 1;
		i *= 3;
		i /= 4;
		i %= 2;
		
		//Relational
		bo = i > 0;
		bo = i < 0;
		bo = i >= 0;
		bo = i <= 0;
		bo = i == 0;
		bo = i != 0;
		
		//Logical
		bo = true && true;
		bo = false || true;
		bo = !false;
		
		//Bitwise
		int x = 4;
		int y = 13;
		int z;
		
		z = x&y;
		z = x|y;
		z = x^y;
		z = ~x;
		
	}
	
	public static void handleStrings(){
		String line = "line";
		String line2 = new String("line");
		
	}
	
	public static void handleArrays(int n){
		
		int[] array1 = new int[n];
		
		for(int i=0; i < n; i++)
			array1[i] = i;
		
		int[] array2 = {0,1,2,3,4};
		
		printArrays(array1);
		printArrays(array2);
		
	}
	
	public static void printArrays(int[] array){
		for(int e : array){
			System.out.println(e);
		}
		
	}
}
