import java.util.*;
public class pratical_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of class: ");
		int total_class=sc.nextInt();
		int[] arr=new int[total_class];
		if(total_class<=10) {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter present/absent status: ");
				arr[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					count++;
				}
			}
			if(count>5) {
				System.out.println("Allowed");	
	}
}
		
		
		
		
		
		
		else {
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter present/absent status: ");
				arr[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) {
					count++;
				}
			}
			if(count>5) {
				System.out.println("Not Allowed");
			}
		}
	}

}
