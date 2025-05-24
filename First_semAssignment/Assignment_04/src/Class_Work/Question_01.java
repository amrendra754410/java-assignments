package Class_Work;
import java.util.*;
public class Question_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2=sc.nextInt();
		System.out.print("Enter Third number: ");
		int num3=sc.nextInt();
		int sum=0;
		for(int i=num1; i<=num2; i+=num3) {
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.println("The sum of number displayed is "+sum);
	}

}
