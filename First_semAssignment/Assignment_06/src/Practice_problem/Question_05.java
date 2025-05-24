package Practice_problem;
import java.util.*;
public class Question_05 {
	public static double area(int n, double side) {
		double area=(n*side*side)/4*(Math.tan(Math.PI/n));
		return area;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Angle: ");
		int angle=sc.nextInt();
		System.out.println("Enter side: ");
		int side=sc.nextInt();
		System.out.println(area(angle,side));			
	}
	

}
