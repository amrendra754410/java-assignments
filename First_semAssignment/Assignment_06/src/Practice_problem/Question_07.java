package Practice_problem;
import java.util.*;
public class Question_07 {
	public static int count(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || 
			   str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count +=1;
				
			}
		}
		return count;
	}
	
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		System.out.println(count(str));
		
	}

}
