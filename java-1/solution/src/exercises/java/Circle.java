package exercises.java;

public class Circle {
	
	private double radius;
	private String color;
	
	Circle(){
		this.radius = 1.0;
		this.color = "red";
	}
	
	Circle(double radius){
		this.radius = radius;
		this.color = "red";
	}
	
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius(){
		
		return this.radius;
	}
	
	public void setRadius(double radius){
	
		this.radius = radius;
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public void setColor(String color){
		
		this.color = color;
	}
	
	public double getArea(){
		
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	@Override
	public String toString(){
		
		return "Radius: "+this.radius+" Color: "+this.color;
	} 
}
