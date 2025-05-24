package Class_Work;
import java.util.*;
public class Question_10 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number(n): ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int sum=0;
		System.out.printf("%d %d %d ",a,b,c);
		for(int i=1;i<=(n-3);i++) {
			sum=a+b+c;
			System.out.print(sum+" ");
			a=b;b=c;c=sum;
		}
	}
}
