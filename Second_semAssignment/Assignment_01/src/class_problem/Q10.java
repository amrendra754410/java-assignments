package class_problem;
import java.util.Scanner;

public class Q10 {
	public static void sum(int [][] arr) {
		for (int i=0; i<arr[0].length; i++) {
			int sum = 0;
			for (int j =0; j<arr.length; j++) {
				//System.out.println(i+" "+j);
				sum += arr[j][i];
			}
			System.out.println("Sum of the elements at column "+i+" is "+sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int [][] arr=new int[3][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				// System.out.print(i + " " + j);
				arr[i][j]= (int) Math.floor(Math.random() * 10);
			}
		}
		Q9.print(arr);
		sum(arr);
		
		




		sc.close();
	}

}