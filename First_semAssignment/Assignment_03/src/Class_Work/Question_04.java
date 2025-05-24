package Class_Work;
import java.util.Scanner;
public class Question_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*9)+1;
		System.out.print("Enter the number between 1 to 9: ");
		int num = sc.nextInt();
		String youAre=null;
		if(num==random)
			youAre="You got it right";
		else if(num+1==random || num-1==random)
			youAre="Almost got it";
		else
			youAre="You got it wrong";
		System.out.println("Computer guesses: "+random);
		System.out.println("\""+youAre+"\"");
		
		
				
		

	}

}
