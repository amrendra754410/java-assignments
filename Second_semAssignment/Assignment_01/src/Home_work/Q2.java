package Home_work;
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String arr[]=new String[3];
		System.out.println("Enter the Three String: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
		sc.close();
	}
	
}
