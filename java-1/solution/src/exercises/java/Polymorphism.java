package exercises.java;

public class Polymorphism {
	
	public static void main(String[] args){
		
		Shape shape = new Rectangle(2,5);
		System.out.println("**Rectangle:");
		System.out.println("Area: "+shape.getArea());
		System.out.println("Perimeter: "+shape.getPerimeter());
		
		shape = new Circle(5);
		System.out.println("**Circle");
		System.out.println("Area: "+shape.getArea());
		System.out.println("Perimeter: "+shape.getPerimeter());
		
		/*
		 * Following methods were not overridden in Square class, hence
		 * take default values from super classes to implement them.
		 * */
		shape = new Square(5);
		System.out.println("**Square");
		System.out.println("Area: "+shape.getArea());
		System.out.println("Perimeter: "+shape.getPerimeter());
		
	}
}
