package Class_Work;
import java.util.*;
public class Question_01 {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			}
		return sum;
	}
	public static void main(String args []) {
		int randomArray[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("Enter the value of array with index "+i+" : ");
			randomArray[i]=sc.nextInt();
		}
		System.out.println("Sum of all number is "+sum(randomArray));
		System.out.println("Average of all number is "+sum(randomArray)/5);
		
		
		
	}

}
