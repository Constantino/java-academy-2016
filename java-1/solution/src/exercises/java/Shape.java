package exercises.java;

public abstract class Shape {

	protected String color;
	protected boolean filled;
	
	public Shape(){
		
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public void setColor(String color){
		
		this.color = color;
	}
	
	public boolean isFilled(){
		
		return this.isFilled();
	}
	
	public void setFilled(Boolean isFilled){
		
		this.filled = isFilled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}
