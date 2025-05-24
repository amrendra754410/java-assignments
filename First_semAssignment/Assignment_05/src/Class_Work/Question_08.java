package Class_Work;
import java.util.*;
public class Question_08 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int sum1=0;
			for(int j=1;j<=i;j++) {
				sum1=sum1+j;
			}  
			sum=sum+sum1;
			System.out.println(sum+" ");

		}
		
	}

}
