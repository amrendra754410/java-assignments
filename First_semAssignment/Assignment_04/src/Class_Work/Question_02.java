package Class_Work;
import java.util.*;
public class Question_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int num=sc.nextInt();
		int temp=num;
		int j,l=0;
		while(num>0) {
			j=num%10;
			num=num/10;
			l=l+j;
		}
		if(l%9==0)
			System.out.println("The number "+temp+" is divisible by 9.");
		else
			System.out.println("The number "+"is not divisible by 9.");
	}

}
