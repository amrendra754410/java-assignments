package Home_Assignment;
import java.util.Scanner;
import java.lang.Math;
public class Question_03 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the point x1 of trangle: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the point y1 of trangle: ");
		double y1 = sc.nextDouble();
		System.out.print("Enter the point x2 of trangle: ");		
		double x2 = sc.nextDouble();
		System.out.print("Enter the point y2 of trangle: ");
		double y2 = sc.nextDouble();
		System.out.print("Enter the point x3 of trangle: ");
		double x3 = sc.nextDouble();
		System.out.print("Enter the point y3 of trangle: ");
		double y3 = sc.nextDouble();
		double side1 = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		double side2 = Math.sqrt(((x3-x2)*(x3-x2))+((y2-y1)*(y2-y1)));
		double side3 = Math.sqrt(((x3-x1)*(x3-x1))+((y3-y1)*(y3-y1)));
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
		System.out.println(area);
		
		
	}

}





