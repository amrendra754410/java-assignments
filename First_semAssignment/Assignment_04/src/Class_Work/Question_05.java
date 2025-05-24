package Class_Work;
import java.util.*;
public class Question_05 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		System.out.print(num);
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num)
			 System.out.println(" is a perfect number");
		else
			System.out.println(" is not a perfect number");
	}

}
