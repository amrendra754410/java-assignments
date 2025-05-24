package practice_problem;
import java.util.Scanner;
public class Question_02 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance: ");
		double Dist1 = sc.nextDouble();
		System.out.println("Distance between two cites is: "+Dist1+" Km");
		System.out.println(Dist1+" km is "+(Dist1*1000)+" meters");
		System.out.println(Dist1+" km is "+(Dist1*3280.8399)+" feet");
		System.out.println(Dist1+" km is "+(Dist1*39370.0787)+"inch");
		System.out.println(Dist1+" km is "+(Dist1*100000)+"centimetre");
	}
	
}





