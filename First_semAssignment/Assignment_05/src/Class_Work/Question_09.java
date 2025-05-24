package Class_Work;
import java.util.*;
public class Question_09 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(1/Math.pow(i,2));
		}
		System.out.println(sum);
				
	}

}
