package class_problem;
import java.util.*;
public class Q9 {
	public static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static double sum(double arr[][]) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i][i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double [][] arr=new double[4][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(i + " " + j);
				arr[i][j]=sc.nextDouble();
			}
		}
		System.out.println(sum(arr));	
		




		sc.close();
	}

}
