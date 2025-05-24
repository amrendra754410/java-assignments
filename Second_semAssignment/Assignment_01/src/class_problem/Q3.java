package class_problem;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int prod=1;
		while(n>0) {
			int digit=n%10;
			sum +=digit;
			prod *=digit;
			n =n/10;
		}
		if(prod==sum) {
			System.out.println(temp+" is a spy number.");
		}
		else {
			System.out.println(temp+" is not a spy number.");
			
		}
		



		sc.close();
	}

}
