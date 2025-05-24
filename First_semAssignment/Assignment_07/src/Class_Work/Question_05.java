package Class_Work;
import java.util.Scanner;
public class Question_05 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		System.out.println();
		int n=10;
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i==arr.length-1?"]":", "));
		}
		System.out.println();
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		int Sec_largest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Sec_largest && arr[i]<largest) {
				Sec_largest = arr[i];
			}
		}
		
		System.out.println("largest: "+largest);
		System.out.println("Second largest: "+Sec_largest);
	}
}
