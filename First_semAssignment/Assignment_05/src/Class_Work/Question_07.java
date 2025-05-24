package Class_Work;
import java.util.*;
public class Question_07 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter n: ");
//		int n=sc.nextInt();
		int n=5;
		
		//a)
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		//b)
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("$"+" ");
			}
			System.out.println();
		}
		
		//c)
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
