package Home_Assignment;
import java.util.*;
public class Question_02 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the number: ");
//		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
				
			}
		}
		System.out.println("Sum="+sum);
		sc.close();
	}
}
