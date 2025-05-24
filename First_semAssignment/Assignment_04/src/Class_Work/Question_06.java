package Class_Work;
import java.util.*;
public class Question_06 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base=sc.nextInt();
		System.out.print("Enter the power: ");
		int power=sc.nextInt();
		int temp=1;
		for(int i=1;i<=power;i++) {
			temp=base*temp;
		}
		System.out.println(base+" to the power "+power+" is: "+temp);
	}

}
