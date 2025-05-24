package practice_problem;
import java.util.Scanner;
public class Question_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number between 0 to 1000 other wise enter zero ");
		int No1 = sc.nextInt();// 789
		int unit = No1%10;//9
		int x= No1/10; //78
		int ten = x%10;  //8
		int y = x/10;
		int hundred = y%10;//7
		System.out.println("Enter a number  : "
				            + No1+" the sum of the digits is "
				            + (unit+ten+hundred));
		
	}

}








