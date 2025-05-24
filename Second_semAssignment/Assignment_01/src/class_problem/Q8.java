package class_problem;
import java.util.*;
public class Q8 {
	public static void print(int arr[][]) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+sum);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of 2D array: ");
		int arr[][]=new int[sc.nextInt()][sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print("Enter the value of arra at index ("+i+","+j+")");
				arr[i][j]=sc.nextInt();
			}
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr));
		print(arr);





		sc.close();
	}

}
