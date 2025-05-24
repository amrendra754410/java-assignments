package Practice_problem;
import java.util.*;
public class Question_09 {
	public static int count_digit(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if((int)str.charAt(i)>=49 && (int)str.charAt(i)<=58) {
				count++;
			}
		}
//		System.out.println(count);
		return count;
		
	}
	public static boolean check(String str) {
		if(str.length()>=8 && count_digit(str)>=2) {
			
			for(int i=0;i<str.length();i++) {
//				System.out.println(i+ " compare"+ (int)str.charAt(i));
				if(!(((int)str.charAt(i)>=49 && (int)str.charAt(i)<=58) || ((int)str.charAt(i)>=97 && (int)str.charAt(i)<=123) || ((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)))
				{
//					System.out.println("false");
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password ");
		String input=sc.nextLine();
		System.out.println(check(input));
		
	}

}
