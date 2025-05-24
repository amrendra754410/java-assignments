package Home_Assignment;
import java.util.*;
public class Question_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of eggs: ");
		int no_egg=sc.nextInt();
		int gross_egg=no_egg/144;
		int dozen_egg=(no_egg-(gross_egg*144))/12;
		int left_egg=(no_egg-(gross_egg*144+dozen_egg*12))%12;
		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d.",gross_egg,dozen_egg,left_egg);
		
		

	}

}
