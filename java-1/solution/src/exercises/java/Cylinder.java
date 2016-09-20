package exercises.java;

public class Cylinder extends Circle{

	private double height;
	
	Cylinder(){
		super();
		this.height = 1.0;
	}
	
	Cylinder(double radius){
		
		super(radius);
		
	}
	
	Cylinder(double radius, double height){
		
		super(radius);
		this.height = height;
	}
	
	Cylinder(double radius, double height, String color){
		
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight(){
		
		return this.height;
	}
	
	public void setHeight(double height){
		
		this.height = height;
	}
	
	public double getVolume(){
		
		return super.getArea()*this.height;
	}
	
	public static void main(String[] args){
		
		Cylinder c = new Cylinder(5,3,"blue");
		
		System.out.println("toString(): "+c.toString());
		System.out.println("Volume: "+c.getVolume());
		System.out.println("set radius = 3 "); c.setRadius(3);
		System.out.println("toString(): "+c.toString());
		System.out.println("Volume: "+c.getVolume());
		
	}
}
