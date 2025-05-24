package Home_Assignment;
import java.util.*;
public class Question_01 {
	public static void main(String args []) {
		int sum=0,num=0,sum1=0;
		System.out.print("The sum of the squares of the first ten natural numbers is: ");
		for(int i=1;i<=10;i++) {
			num=i*i;
			sum=sum+num;
		}
		System.out.println(sum);
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
		}
		int output=sum1*sum1;
		System.out.println("The square of the sum of the first ten natural numbers is: "+output);
		System.out.println("Difference of those number is "+(output-sum));
		
	}

}
