package exercises.java;

public class Animal {
	
	public String kingdom;
	protected String petName;
	private int paws;
	
	Animal(){
		
		this.paws = 4;
	}
	
	Animal(int paws){
		
		this.paws = paws;
	}
	
	public int getPaws(){
		
		return this.paws;
	}
	
	public void setPaws(int nPaws){
		
		this.paws = nPaws;
	}
	
	public void eat(){
		
		System.out.println("eating");
	}
	
	public void run(){
		
		System.out.println("running");
	}
	
	public void walk(){
		
		System.out.println("walking");
	}
	
	public void walk(int x1, int y1, int x2, int y2){
		
		System.out.println("walking from: "+x1+","+y1+" to: "+x2+","+y2);
	}
	
}
