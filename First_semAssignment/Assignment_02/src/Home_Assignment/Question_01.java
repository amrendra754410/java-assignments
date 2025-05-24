package Home_Assignment;
import java.util.Scanner;
public class Question_01 {
	  public static void main(String args []) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter the minutes: ");
		  int min  = sc.nextInt();
		  int year = min/(60*24*365);
		  int days = min%(60*24*365)/(24*60);
		  
		  System.out.println("Enter the number of minutes: "+min);
		  System.out.println(min+(" minutes is approximately "+year+" Year "+days+" Days"));
	  }

}







