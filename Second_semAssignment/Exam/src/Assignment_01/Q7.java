package Assignment_01;
import java.util.*;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of element of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter element ot the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int Max_check=Integer.MIN_VALUE;
		int Min_check=Integer.MAX_VALUE;
		int Max=0,Max_count=0,First_max=0;
		int Min=0,Min_count=0,last_min=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Max_check) {
				Max=arr[i];
				Max_count=1;
				First_max=arr[i];
			}
			else if(arr[i]==Max) {
					Max_check++;
				}
			
		}
		
		
	}

}
