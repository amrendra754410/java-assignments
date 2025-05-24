package Practice_problem;
import java.util.*;
public class Question_03 {
	public static int reverse(int num) {
		//int i=1;
		int newNum=0;
		while(num>0) {
			int digit=num%10;
			newNum=newNum*10+digit;
			num=num/10;
		}
		return newNum;
	}
	public static boolean isPalindrome(int num) {
		if(num==reverse(num)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args []) {
		System.out.println(isPalindrome(111));
		
	}

}
