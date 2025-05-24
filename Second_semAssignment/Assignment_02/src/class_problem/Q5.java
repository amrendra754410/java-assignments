package class_problem;
abstract class Shape{
	abstract double area();
}
class Square extends Shape{
	double side;
	Square(double side) {
		this.side=side;	
	}
	double area() {
		return side*side;
	}
}
class Tringle extends Shape{
	double base;
	double height;
	Tringle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	double area() {
		return (1.0/2)*base*height;
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius) {
		this.radius=radius;
	}
	double area() {
		return Math.PI*radius*radius;
		
	}
}
public class Q5 {
	public static void main(String args[]) {
		Square s=new Square(2.0);
		System.out.println((int)s.area());
		System.out.println("---------------");
		Tringle t=new Tringle(2.0,4.0);
		System.out.println((int)t.area());
		System.out.println("---------------");
		Circle c=new Circle(5.0);
		System.out.println((int)c.area());
	}

}
