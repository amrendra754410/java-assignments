package Class_Work;

import java.util.Scanner;

public class Question_06 {
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
		
		
		
		for(int i=0;i<arr.length;i++) {
			int j=arr.length-1-i;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
//		int ar[]= {1,2,3,4,5,6,7,8,9,};
//		for(int i=0; i<ar.length/2;i++) {
//			int temp=ar[i];
//			ar[i]=ar[ar.length-1-i];
//			ar[ar.length-1-i]=temp;
//		}
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i==arr.length-1?"]":", "));
		}
//		System.out.println();
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i]+" ");
//		}
	}
}
