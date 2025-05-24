package Practice_problem;

import java.util.Scanner;

public class Question_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1=sc.nextInt();
		System.out.print("Enter the Symbol(+,-,*,/,%): ");
		String operator=sc.next();
		System.out.print("Enter the second number: ");
		int n2=sc.nextInt();
		if(operator.equals("+")) {
			System.out.println(additionsimple(n1,n2));
		}
		else if(operator.equals("-")) {
			System.out.println(subtractionsimple(n1,n2));
		}
		else if(operator.equals("*")) {
			System.out.print(multiplicationsimple(n1,n2));
		}
		else if(operator.equals("/")) {
			System.out.print(divisionsimple(n1,n2));
		}
		else if(operator.equals("%")) {
			System.out.print(remindersimple(n1,n2));
		}
		
		

	}
	public static int additionsimple(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	public static int subtractionsimple(int num1, int num2) {
		int sub=num1-num2;
		return sub;
	}
	public static int multiplicationsimple(int num1, int num2) {
		int multi=num1*num2;
		return multi;
	}
	public static int divisionsimple(int num1, int num2) {
		int division=num1/num2;
		return division;
	}
	public static int remindersimple(int num1, int num2) {
		int rem=num1%num2;
		return rem;
	}
	public static double squareroot(double num1) {
		double sRoot=Math.sqrt(num1);
		return sRoot;
	}


}
