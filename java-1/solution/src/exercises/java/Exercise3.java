package exercises.java;

public class Exercise3 {
	
	public static void main(String[] args){
		
		printOutput1();
		printOutput2();
		System.out.println("\n**** 3 - something returned:"+getSomething());
		foo();
	}
	
	//Point 1
	public static void printOutput1(){
		
		System.out.println("\n**** Output 1:");
		
		int th = 0;
		int daf = 4;
		for (int i=1; i<25;i++){
		th = ++th;
		if(th > daf)
		break;
		System.out.println("Fishing for hour "+ i);
		}
	}
	
	//Point2
	public static void printOutput2(){
		
		System.out.println("\n**** Output 2:");
		
		int tdc = 0;
		int daf = 5;
		for (int i=1; i<8; ++i){
			System.out.println("\nDay "+ i + ": camping");
			tdc = ++tdc;
			if(tdc > daf)
				continue;
		
			System.out.println("and Fishing");
		}
	}
	
	//Point 3
	public static String getSomething(){
		
		return "Something";
	}
	
	//Point 4
	public static void foo () {
		
		System.out.println("\n**** Value of b:");
		
		int b = 1;
		b++;
		
		System.out.println(b);
	}
	
}
