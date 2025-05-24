package Assignment_01;
import java.util.*;
public class Q8 {
	public static void print(int arr[][]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(i+" "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		print(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.deepToString(arr));
	}
}
