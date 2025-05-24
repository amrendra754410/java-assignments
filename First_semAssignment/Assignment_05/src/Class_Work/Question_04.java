package Class_Work;
import java.util.*;
public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter teh first number: ");
		int num=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num1=sc.nextInt();
		for(int i=num;i<=num1;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}

	}

}
