package Home_Assignment;
import java.util.*;
public class Question_05 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the N: ");
		//int user = sc.nextInt();
//		int user=4;
//		for(int i=1;i<=user;i++) {
//			for(int j=1;j<=i;j++) {
//				for(int k=1;k<=j;k++) {
//					System.out.print(k);
//				}
//			}
//			System.out.println();
//		}
		
        System.out.println("Enter the number of rows: ");
        
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
		
		
	}

}
