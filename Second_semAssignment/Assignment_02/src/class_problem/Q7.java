package class_problem;

class Shape1{
	String color;
	Shape1(String color){
		this.color=color;
	}
}
class Circle1 extends Shape1{
	double radius;
	double area;
	Circle1(String s,double r){
	super(s);
	this.radius=r;
	this.area=area();
	}
	double area() {
		double area2= (Math.PI*this.radius*this.radius);
		return area2;
	}
	void display() {
		System.out.println("The shape is Circle");
		System.out.println("Area of Circle is "+area);
	}
}
class Rectangle1 extends Shape1{
	double length;
	double bredth;
	double area;
	Rectangle1(String s,double l,double b){
		super(s);
		this.length=l;
		this.bredth=b;
		this.area=area();
	}
	double area() {
		double area1=(2*(length*bredth));
		return area1;
	}
	void display() {
		System.out.println("The shape is rectangle");
		System.out.println("Area of rectangle is "+area);
	}
}
public class Q7 {
	public static void main(String args[]) {
		Rectangle1 r=new Rectangle1("Blue", 5, 10);
		r.area();
		r.display();
		Circle1 c=new Circle1("Red",5);
		c.area();
		c.display();
	}

}
