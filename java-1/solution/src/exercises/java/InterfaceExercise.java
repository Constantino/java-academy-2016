package exercises.java;

public class InterfaceExercise implements CharSequence {

	private String myString;
	
	InterfaceExercise(){
		this.myString = "";
	}
	
	InterfaceExercise(String myString){
		
		this.myString = myString;
	}
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return myString.length();
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return myString.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return myString.substring(start, end);
	}
	
	public String getStringBackwards(){
		
		return new StringBuffer(this.myString).reverse().toString();
	}

	
}
