package Class_Work;
import java.util.*;
public class Question_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int prime=1;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=0;
				break;
			}
		}
		int temp=num;
		int twisted=0;
		while(temp>0) {
			int digit=temp%10;
			twisted=twisted*10+digit;
			temp=temp/10;
		}

		int prime1=1;
		for(int i=2;i<twisted;i++) {
			if(twisted%i==0) {
				prime1=0;
				break;
			}
		}
		if(prime==prime1) {
			System.out.println(num+" is twisted prime.");
		}
		else
			System.out.println(num+" is not twisted prime.");
	}

}
