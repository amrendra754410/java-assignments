package Class_Work;
import java.util.*;
public class Question_09 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int user=sc.nextInt();
		int	num=user;
		int output=0;
		int index=0;
		while(num!=0) {
			int digit=num%10;
				num=num/10;
				if(digit!=0) {
					output +=(int)(digit*Math.pow(10, index));
					index++ ;
				}
		}
		System.out.println("After removing Zero from number "+user+" the new number is "+output);
		
		
	}
	

}
