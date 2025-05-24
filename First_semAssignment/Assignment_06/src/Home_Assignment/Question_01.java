package Home_Assignment;
import java.util.*;
public class Question_01 {
	public static char non_repeated(String str) {
		char output=' ';
		for(int i=0;i<str.length();i++) {
			char v=str.charAt(i);
			int count=0;
			//System.out.println(count);
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==v) {
					count++;
				}
			}
			if(count>2) {
				output=v;
				
			}
		}
		return output;
	}
	
	
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String new_String=sc.nextLine();
		System.out.println("The first non repeting charater is "+non_repeated(new_String));
	}
}

}
