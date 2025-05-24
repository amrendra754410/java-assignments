package Class_Work;
import java.util.*;
public class Question_05 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the Second number");
		int num2=sc.nextInt();
		System.out.println("Multiplication table of "+num1);
		for(int i=num1;i<=num2;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"X"+j+"="+j*i);
			}
			System.out.println();
			System.out.println("Multiplication table of "+(i+1));
		}
	}

}
