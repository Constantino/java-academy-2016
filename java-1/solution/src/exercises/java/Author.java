package exercises.java;

public class Author {
	
	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
		
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public String getEmail(){
		
		return this.email;
	}
	
	public char getGender(){
		
		return this.gender;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public void setEmail(String email){
		
		this.email = email;
		
	}
	
	public void setGender(char g){
		
		this.gender = g;
	}
	
	@Override
	public String toString(){
		
		return "Name: "+this.name+" email: "+this.email+" gender: "+this.gender;
	}
}
