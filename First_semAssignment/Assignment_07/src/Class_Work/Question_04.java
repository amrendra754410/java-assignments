
package Class_Work;
import java.util.Scanner;
public class Question_04 {
	public static double min(double[] array) {
		double smallest=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<smallest) {
				smallest=array[i];
			}
		}
		return smallest;
	}
	
		public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		double[] arr=new double[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		double smallest_value=min(arr);
		System.out.println(smallest_value);
		
		
		
	}
}
