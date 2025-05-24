package class_problem;
import java.util.Scanner;
public class Q6 {
	public static boolean isOdd(int n) {
		if((n & 1)==1) {
			return true;
		}
		return false;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		if (isOdd(num)) System.out.println("True");
		else System.out.println("False");





		sc.close();
	}

}
				