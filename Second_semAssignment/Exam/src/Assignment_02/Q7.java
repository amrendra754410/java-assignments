package Assignment_02;
class Shape{
	String color;
	Shape(String color){	
	}
}
class Circle extends Shape{
	double radius;
	Circle(String color,double radius){
		super(color);
		this.radius=radius;
		this.color=color;
	}
	void display() {
		System.out.println("Radius of circle: "+radius);
		System.out.println("Color of the circle: "+color);
	}
	void area() {
		System.out.println("Area od Circle: "+Math.PI*radius*radius);
	}
	
}
class Rectangle extends Shape{
	String color;
	double length;
	double width;
	Rectangle(String color,double width,double length){
		super(color);
		this.length=length;
		this.width=width;
		this.color=color;
	}
	void display() {
		System.out.println("width of Rectangle: "+width);
		System.out.println("length of Rectangle: "+length);
		System.out.println("Color of the Rectangle: "+color);
	}
	void area() {
		System.out.println("Area of Rectangle: "+2*(length+width));
	}
	
}
public class Q7 {

}
