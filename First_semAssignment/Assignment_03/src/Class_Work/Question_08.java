 package Class_Work;
import java.util.Scanner;
public class Question_08 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the both axis: ");
		double xAxis = sc.nextDouble();
		double yAxis = sc.nextDouble();
		String quad=" ";
		if(xAxis==0) {
			if(yAxis==0) 
				System.out.println("Origin");
			else
				System.out.println("Y-axis");
		}
		else if(xAxis>0) {
			if(yAxis>0) 
				quad="I";
			else if(yAxis<0) 
				quad="IV";
			else 
				System.out.println("x-axis");
		}
		else {
			if(yAxis>0)
				quad="II";
			else if(yAxis<0)
				quad="III";
			else
				System.out.println("x-Axis");
		}
		System.out.println(xAxis+", "+yAxis+" is in quadrant "+quad);
				
 }

}
