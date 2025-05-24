package Class_Work;
import java.util.Scanner;
public class Question_05 {
	public static void main(String arga []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the year: ");
		int year = sc.nextInt();
		String year1;
		if (year%100!=0 && year%4==0 || year%400==0 ) 
			year1="true";
		else
			year1="False";
		System.out.println(year+" is a leap: "+year1);
		
		}
	}
	


