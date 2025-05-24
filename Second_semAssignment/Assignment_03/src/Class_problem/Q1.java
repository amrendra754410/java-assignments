package Class_problem;
import java.util.*;
public class Q1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		try {
			if(num<0) {
			throw new NumberFormatException("Negative numbe not allows");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
