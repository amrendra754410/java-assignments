package Practice_problem;
import java.util.*;
public class Question_04 {
	public static int day_in_year(int num) {
		if(num%400==0 && num%4==0 || num%100!=0) {
			return 366;
		}
		else {
			return 365;
		}
	}
	public static void main (String args []) {
		int num1=2000;
		int num2=2020;
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			sum+=day_in_year(i);
		}
		System.out.println(sum+" days");
	}

}
