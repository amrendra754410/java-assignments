package Class_Work;
import java.util.*;
public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2=sc.nextInt();
//		int gcd=0;
//		for(int i=1;i<=num1 && i<=num2;i++) {
//			if(num1%i==0 && num2%i==0)
//				gcd=i;
//		}
//		System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
		
		     //OR
		int gcd=0;
		while((num1%num2)!=0) {
			gcd=num1%num2;
			num1=num2;
			num2=gcd;
		}
		System.out.println("GCD of "+num1+" and "+num2+" is "+gcd+".");
	}

}
