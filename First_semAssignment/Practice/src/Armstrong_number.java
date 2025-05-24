import java.util.*;
public class Armstrong_number {
	public static String check_armstrong(String str) {
		String output="False";
		int output1=0;
		for(int i=0;i<str.length();i++) {
			output +=Math.pow((int)str.charAt(i), (int)str.length());
		}
		if(Integer.toString(output1).equals(str)) {
			output="True";
			
			
		}
		return output;
		
	}
	
	public static void main(String args []) {
		
		System.out.println(check_armstrong("153"));
	}

}
