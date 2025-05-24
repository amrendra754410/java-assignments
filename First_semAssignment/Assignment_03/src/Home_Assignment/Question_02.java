package Home_Assignment;
import java.util.*;
public class Question_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today=sc.nextInt();
		String str=null;
		String str1=null;
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed=sc.nextInt();
		int a=today+elapsed;
		switch(today) {
		case 0:
			str1="Sunday";
			break;
		case 1:
			str1="Monday";
			break;
		case 2:
			str1="Tuseday";
			break;
		case 3:
			str1="Wednesday";
			break;
		case 4:
			str1="Thursday";
			break;
		case 5:
			str1="Friday";
			break;
		case 6:
			str1="Saturday";
			break;
	}
		switch(a) {
			case 0:
				str="Sunday";
				
				break;
			case 1:
				str="Monday";
				break;
			case 2:
				str="Tuseday";
				break;
			case 3:
				str="Wednesday";
				break;
			case 4:
				str="Thursday";
				break;
			case 5:
				str="Friday";
				break;
			case 6:
				str="Saturday";
				break;
		}
		System.out.println("Today is "+str1+" and the future day is "+str);	

	}

}
