package Class_Work;
import java.util.*;
public class Question_10 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int user=sc.nextInt();
		int output=3;
		while(output*3<user) {
			output=output*3;
		}
		System.out.println("The largest power of 3 less than or equal to "+user+" is "+output);
	}

}
