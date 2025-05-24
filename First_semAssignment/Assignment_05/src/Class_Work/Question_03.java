package Class_Work;
import java.util.*;
public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			boolean prime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
				}
			}
			if(prime) {
				System.out.print(i+" ");
			}
		}

	}

}
