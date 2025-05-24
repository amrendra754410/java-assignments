package Class_Work;
import java.util.Scanner;
public class Question_07 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("NO. of units consumed: ");
		double unit = sc.nextDouble();
		System.out.print("Do yo want to pay online (y/n): ");
		char online=sc.next().charAt(0);
		double amount;
		if(unit<=50) 
			amount=(unit*3);
		else if(unit<=200)
			amount=(50*3)+((unit-50)*4.80);
		else if(unit<=400)
			amount=(50*3)+(200-50)*4.8+((unit-200)*5.80);
		else
			amount=(50*3)+(200-50)*4.80+(400-200)*5.80+((unit-400)*6.20);
		if(online=='y' || online=='Y') {
			double discount=amount*(3.0/100);
			System.out.println("Total amount: "+amount);
			System.out.println("Discount: "+discount);
			System.out.println("Amount payable: "+(amount-discount));
			}
		
		
	}

}
