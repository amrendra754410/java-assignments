package Home_Assignment;
import java.util.*;
public class Question_02 {
	public static double volume(double side) {
		double volume=side*side*side;
		return volume;
	}
	public static double volume(int radius) {
		double volume=(4.0/3)*Math.PI*Math.pow(radius,3);
		return volume;
	}
	public static double volume(double l,double b,double h) {
		double volume=l*b*h;
		return volume;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		//volume of cube
		System.out.println("Volume of cube "+volume(10.0));
		//volume of sphere
		System.out.println("volume of sphere "+volume(10));
		//volume of cubiod
		System.out.println("Volume of cubiod "+volume(5.0,4.8,8.4));
		
		
	}

}
