package Class_Work;
import java.util.Scanner;
public class Question_06 {
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter units: ");
		double unit = sc.nextDouble();
		double amount;
		if(unit<=50)
			amount=(unit*3);
		else if(unit<=200)
			amount=(50*3)+((unit-50)*4.80);
		else if(unit<=400)
			amount=(50*3)+(200-50)*4.8+((unit-200)*5.80);
		else
			amount=(50*3)+(200-50)*4.80+(400-200)*5.80+((unit-400)*6.20);
		System.out.println("Mothly bill is Rs."+amount+"/-");
		
	}

}
