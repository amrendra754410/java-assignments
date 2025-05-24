package Practice_problem;
import java.util.*;
public class Question_10 {
	// for square
	public static double area(double side) {
		double area= side*side;
		return area;
	}
	// for trangle
	public static double area(double base, double height) {
		double area=1.0/2*base*height;
		return area;
	}
	// for circle
	public static double area(int radius) {
		double area=2*Math.PI*radius;
		return area;
	}
	// for rectangle
		public static double area(int length, double breadth) {
		double area=2*(length+breadth);
		return area;
	}
	public static void main(String args []) {
		
		
	}

}
