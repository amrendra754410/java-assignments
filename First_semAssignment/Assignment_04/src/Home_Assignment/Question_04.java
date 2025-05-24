package Home_Assignment;
import java.util.*;
public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n: ");
		int n=sc.nextInt();
		int sum_even=0;
		int multi_odd=1;
		System.out.print("Sum of all even numbers = ");
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) { //Even
				System.out.print(i+" + ");
				sum_even +=i;
			}
			else {
				multi_odd *=i;			
			}
		}
		System.out.println("= "+sum_even);
		System.out.println("Multiple of all odd number = "+multi_odd);
	}

}
