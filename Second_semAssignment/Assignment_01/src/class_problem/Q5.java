package class_problem;
import java.util.Scanner;
public class Q5 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		while(n>10) {
			int sum=0;
			while(n>0) {
				sum +=n%10;
				n = n/10;
			}
			n=sum;
		}
		System.out.println("Sum of digits of "+temp+" until the number is a single digit is "+n);
		



		sc.close();
	}
}
