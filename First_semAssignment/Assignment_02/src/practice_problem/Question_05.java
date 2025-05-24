package practice_problem;
import java.util.Scanner;
//import java.lang.Math;
public class Question_05 {
	public static void main(String[] arga) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble(); 
		double sa = (3*Math.PI*radius*radius); //Surface Area of Hemisphere
		double v=(((double)2/3)*Math.PI*radius*radius*radius);
		System.out.println("Here is a simple run:");
		System.out.println("Enter the radius of the hemisphere: "+radius);
		System.out.println("The surface area of the hemisphere is "+sa);
		System.out.println("The volume area of the hemisphere is: "+v);
		
		
		
		
	}
} 

 













