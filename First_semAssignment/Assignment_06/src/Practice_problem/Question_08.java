package Practice_problem;
import java.util.Scanner;
public class Question_08 {
	public static String is_palindrome(String str) {
		String output=null;
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		if(str.equals(str2)) {
			output="Is Palindrome";
		}
		else
			output="Is not Palindrome";
		return output;
	}
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String a=sc.nextLine();
		System.out.println(is_palindrome(a));
	}

}
