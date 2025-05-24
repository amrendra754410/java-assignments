package Class_Work;
import java.util.*;
public class Question_03 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] input_arr=new int[10];
		for(int i=0;i<input_arr.length;i++) {
			System.out.print("Enter the value of array ");
			input_arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value: ");
		int input=sc.nextInt();
		int count=0;
		for(int i=0;i<input_arr.length;i++) {
			if(input_arr[i]==input) {
				count++;
			}
		}
		System.out.println(input+" occurs "+ count +(count>1?" times":" time"));
	}

}
