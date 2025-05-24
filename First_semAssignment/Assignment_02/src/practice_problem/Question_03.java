package practice_problem;
import java.util.Scanner;
public class Question_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Basic Salary: ");
		double Basic_Salary = sc.nextDouble();
		double DA = ((40.0*Basic_Salary)/100);
		double HRS = ((20.0*Basic_Salary)/100);
		double Gross_Salary = (Basic_Salary+DA+HRS);
		System.out.println("DA is "+DA);
		System.out.println("HRS is "+HRS);
		System.out.println("Gross salary is "+Gross_Salary);
		
				
	}
}
