package Class_Work;
import java.util.*;
public class Question_07 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("The multiplication table of "+num+" is:");
		for(int i=1;i<=10;i++) {
			System.out.println(num+"X"+i+"="+(num*i));
		}
	}

}
