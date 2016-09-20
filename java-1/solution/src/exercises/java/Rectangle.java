package exercises.java;

public class Rectangle extends Shape{

	protected double width;
	protected double length;
	
	Rectangle(){
		this.width = 1;
		this.length = 2;
	}
	
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	Rectangle(double width, double length, String color, boolean filled){
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
		
	}
	
	public double getWidth(){
		
		return this.width;
	}
	
	public void setWidth(double width){
		
		this.width = width;
	}
	
	public double getLength(){
		
		return this.length;
	}
	
	public void setLength(double length){
		
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.length+this.width)*2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
