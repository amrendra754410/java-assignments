package Class_Work;
import java.util.Scanner;
public class Question_03 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three number: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if(a<b && a<c) {
			if(b<c)
				System.out.println("Increasing");
		}
		else if(c<a && c<b) {
			if(b<a)
				System.out.println("Decreasing");
		}
		else
			System.out.println("Neither Increasing nor decreasing");
	}

}
