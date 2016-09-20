package exercises.java;

public class Square extends Rectangle {

	private double side; 
	
	Square(){
		
		this.side = 1;
	}
	
	Square(double side){
		
		this.side = side;
	}
	
	Square(double side, String color, boolean filled){
		super(side,side,color, filled);
		this.side = side;
		
	}
	
	public double getSide(){
		 return this.side;
	}
	
	public void setSide(double side){
		
		this.side = side;
	}
	
	public void setWidth(double width){
		
		this.side = width;
	}
	
	public void setLength(double length){
		
		this.side = length;
	}
	
	@Override
	public String toString(){
		
		return "";
	}
}
