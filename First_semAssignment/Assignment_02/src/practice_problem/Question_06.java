package practice_problem;
import java.util.Scanner;
public class Question_06 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time: "); //time in Second
		double time = sc.nextDouble();
		double g = 32.174;
		double d = (((double)1/2)*g*time*time);
		System.out.println("Here is the  sample run:");
		System.out.println("Enter the number of Seconds: "+time);
		System.out.println("Distance travelled: "+d);
	}

}












