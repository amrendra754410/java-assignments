package Class_Work;
import java.util.Scanner;
public class Question_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many water drink per day; ");
		double water = sc.nextDouble();
		if(water>=5000)
			System.out.println("Yes, Alice is following doctor’s advice");
		else
			System.out.println("No, Alice is not following doctor’s advice");
		

	}

}	
