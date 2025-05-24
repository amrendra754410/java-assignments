package Class_Work;
import java.util.*;
public class Question_03 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		int sum=0;
		int avg=0;
		int i=1;
		System.out.print("Random number generated are: ");
		do {
			int random=(int)(Math.random()*n)+1;
			System.out.print(random+" ");
			sum=sum+random;
			i++;
			}while(i<=n);
		avg=sum/n;
		System.out.println();
		System.out.println("Average of "+n+" random number are "+avg);
		
	}

}
