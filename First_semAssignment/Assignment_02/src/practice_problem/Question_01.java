package practice_problem;
import java.util.Scanner;
public class Question_01 {
	public static void main(String[] args) {
		System.out.print("Enter a degree in Fahrenheit: ");
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		double Celsius = ((f-32)*(5.0/9));
		System.out.println(f+" Fahrenhet is "+Celsius+" Celsius");
	}
	
	

}
