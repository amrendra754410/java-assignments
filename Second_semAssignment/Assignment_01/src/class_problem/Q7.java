package class_problem;

import java.util.Arrays;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter elements of the array: ");
		for (int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, max_count = 0, min_count = 0, max_first = 0, min_last = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				max_count = 1;
				max_first = i;
				
			} else if (arr[i] == max){
				max_count++;
			}
			
			if (arr[i] < min) {
				min = arr[i];
				min_count = 1;
			} else if(arr[i] == min) {
				min_count++;
				min_last = i;
			}
		}
		System.out.println(max + " " + max_count + " " + max_first);
		System.out.println(min + " " + min_count + " " + min_last);
	
		




		sc.close();
	}

}
