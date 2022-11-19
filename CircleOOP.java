/*7/20/2022
*basic oop w classes and methods
*/

public class CircleOOP{
	public static void main(String[] args){
	
		Circle cir = new Circle(Math.round(Math.random()*(1000)));
		
		System.out.println("Circle radius is\t" + cir.radius);
		System.out.println("Circle diameter is\t" + cir.diameter());
		System.out.println("Circle area is\t" + cir.area());
		System.out.println("Circle circumference is\t" + cir.circumference());
		
	}
}

class Circle{

	public double radius;
	
	public Circle(double radius){
	
		this.radius = radius;
	
	}
	
	public double area(){
		
		double area = Math.PI * Math.pow(radius,2);
		return area;
		
	}
	
	public double circumference(){
	
		double circumference = 2*Math.PI*radius;
		return circumference;
	
	}
	
	public double diameter(){
	
		double diameter = 2*radius;
		return diameter;
	
	}
}
